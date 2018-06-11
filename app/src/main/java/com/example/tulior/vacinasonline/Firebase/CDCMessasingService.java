package com.example.tulior.vacinasonline.Firebase;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.util.Log;

import com.example.tulior.vacinasonline.MainMenuActivity;
import com.example.tulior.vacinasonline.R;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import static android.content.ContentValues.TAG;

public class CDCMessasingService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {

        if (remoteMessage.getNotification() != null) {
            Log.w(TAG, "Message Notification Body: " + remoteMessage.getNotification().getBody());
            Log.w(TAG, "Click Action: " + remoteMessage.getNotification().getClickAction());
        } else {
            Log.w(TAG, "onMessageReceived: Null Value");
        }

        super.onMessageReceived(remoteMessage);

        RemoteMessage.Notification notification =
                remoteMessage.getNotification();
        mostrarNotificacao(notification);
    }

    public void mostrarNotificacao(RemoteMessage.Notification notification) {

        Intent intent = new Intent(this, MainMenuActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);

        Notification.Builder builder = new Notification.Builder(getApplicationContext());

        Notification notificacao = builder.setContentTitle(notification.getTitle())
                .setContentText(notification.getBody())
                //.setSmallIcon(R.drawable.ic_logo_splash)
                .setSmallIcon(getResources().getIdentifier(notification.getIcon(),"drawable",this.getPackageName()))
                .setContentIntent(pendingIntent)
                .setStyle(new Notification.BigTextStyle().bigText(notification.getBody()))
                .setAutoCancel(true)
                .build();

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        notificationManager.notify(0, notificacao);
    }

}
package com.example.tulior.vacinasonline.utils;

import android.content.Context;
import android.support.v7.app.AlertDialog;

public final class Utils {
    public static void ShowAlert(Context context, String title, String message, String positiveButton) {
        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(context);
        alertBuilder.setTitle(title);
        alertBuilder.setMessage(message);
        alertBuilder.setPositiveButton(positiveButton, null);
        alertBuilder.show();
    }
}

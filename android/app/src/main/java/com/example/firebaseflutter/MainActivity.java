package com.example.firebaseflutter;

import android.os.Bundle;

import io.flutter.app.FlutterActivity;
import io.flutter.plugins.GeneratedPluginRegistrant;

public class MainActivity extends FlutterActivity {
  public static final int NOTIFICATION_ID = 200;
  public static final String NOTIFICATION_REPLY = "NotificationReply";
  public static final String CHANNNEL_ID = "SimplifiedCodingChannel";
  public static final int REQUEST_CODE_APPROVE = 101;
  public static final String KEY_INTENT_APPROVE = "keyintenthelp";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    GeneratedPluginRegistrant.registerWith(this);
  }
}

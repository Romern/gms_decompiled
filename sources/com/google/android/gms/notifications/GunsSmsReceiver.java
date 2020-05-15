package com.google.android.gms.notifications;

import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GunsSmsReceiver extends aacn {

    /* renamed from: a */
    private final WebView f81218a;

    public GunsSmsReceiver(WebView webView) {
        super("notifications");
        this.f81218a = webView;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        SmsMessage[] messagesFromIntent = Telephony.Sms.Intents.getMessagesFromIntent(intent);
        Pattern compile = Pattern.compile(cfqb.f185420a.mo6606a().mo82490c());
        for (SmsMessage smsMessage : messagesFromIntent) {
            Matcher matcher = compile.matcher(smsMessage.getDisplayMessageBody());
            while (matcher.find()) {
                arrayList.add(matcher.group(1));
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            WebView webView = this.f81218a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28);
            sb.append("javascript:onSmsReceived('");
            sb.append(str);
            sb.append("')");
            webView.loadUrl(sb.toString());
        }
    }
}

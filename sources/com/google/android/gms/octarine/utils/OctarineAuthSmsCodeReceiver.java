package com.google.android.gms.octarine.utils;

import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OctarineAuthSmsCodeReceiver extends aacn {

    /* renamed from: a */
    private final WebView f81413a;

    public OctarineAuthSmsCodeReceiver(WebView webView) {
        super("octarine");
        this.f81413a = webView;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        SmsMessage[] messagesFromIntent = Telephony.Sms.Intents.getMessagesFromIntent(intent);
        Pattern compile = Pattern.compile(cfqz.f185481a.mo6606a().mo82541a());
        for (SmsMessage smsMessage : messagesFromIntent) {
            Matcher matcher = compile.matcher(smsMessage.getDisplayMessageBody());
            while (matcher.find()) {
                arrayList.add(matcher.group(1));
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            try {
                Long.parseLong(str);
                this.f81413a.evaluateJavascript(String.format("if (window.ocTelephonySmsCodeReceived) { window.ocTelephonySmsCodeReceived(%s); }", JSONObject.quote(str)), null);
            } catch (NumberFormatException e) {
            }
        }
    }
}

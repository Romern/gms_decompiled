package com.google.android.gms.auth.login;

import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MinuteMaidAuthSmsReceiver extends aacn {

    /* renamed from: a */
    private static final sek f11022a = ght.m13171a("MinuteMaid", "MinuteMaidFragment");

    /* renamed from: b */
    private final WebView f11023b;

    public MinuteMaidAuthSmsReceiver(WebView webView) {
        super("auth_account");
        this.f11023b = webView;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        f11022a.mo25409a("Receive sms...", new Object[0]);
        ArrayList arrayList = new ArrayList();
        SmsMessage[] messagesFromIntent = Telephony.Sms.Intents.getMessagesFromIntent(intent);
        Pattern compile = Pattern.compile(gnv.m13515Y());
        for (SmsMessage smsMessage : messagesFromIntent) {
            Matcher matcher = compile.matcher(smsMessage.getDisplayMessageBody());
            while (matcher.find()) {
                arrayList.add(matcher.group(1));
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            WebView webView = this.f11023b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28);
            sb.append("javascript:onSmsReceived('");
            sb.append(str);
            sb.append("')");
            webView.loadUrl(sb.toString());
        }
    }
}

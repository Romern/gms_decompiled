package com.google.firebase.auth.api.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import android.text.TextUtils;
import com.felicanetworks.mfc.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SmsCodeAutoRetriever extends aacn {

    /* renamed from: c */
    private static final sek f152497c = new sek("FirebaseAuth", "SmsCodeAutoRetriever");

    /* renamed from: a */
    public final Context f152498a;

    /* renamed from: b */
    public boolean f152499b;

    /* renamed from: d */
    private final Set f152500d;

    /* renamed from: e */
    private final List f152501e = new ArrayList();

    /* renamed from: f */
    private final brlb f152502f;

    public SmsCodeAutoRetriever(Context context, brlb brlb) {
        super("firebase_auth");
        this.f152499b = false;
        this.f152498a = context;
        sdo.m34959a(brlb);
        this.f152502f = brlb;
        this.f152500d = new HashSet(Arrays.asList(cdxz.f181891a.mo6606a().mo78440i().split(",")));
        String h = cdxz.f181891a.mo6606a().mo78439h();
        if (!TextUtils.isEmpty(h)) {
            for (String str : h.split(",")) {
                this.f152501e.add(Pattern.compile(str));
            }
        }
    }

    /* renamed from: a */
    public static boolean m118884a() {
        if (!"unknown".equals(Build.BOARD)) {
            return false;
        }
        if ("generic".equals(Build.BRAND) || "generic_x86".equals(Build.BRAND) || BuildConfig.FLAVOR_client.equals(Build.BRAND)) {
            return "generic".equals(Build.DEVICE) || "generic_x86".equals(Build.DEVICE) || "Android".equals(Build.DEVICE);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0073 A[LOOP:2: B:21:0x006d->B:23:0x0073, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0084 A[EDGE_INSN: B:32:0x0084->B:27:0x0084 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0081 A[SYNTHETIC] */
    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        Matcher matcher;
        ArrayList arrayList = new ArrayList();
        int i = Build.VERSION.SDK_INT;
        SmsMessage[] messagesFromIntent = Telephony.Sms.Intents.getMessagesFromIntent(intent);
        if (messagesFromIntent != null) {
            Pattern compile = Pattern.compile(cdxz.f181891a.mo6606a().mo78438g());
            int i2 = 0;
            boolean z = false;
            while (i2 < messagesFromIntent.length) {
                String displayOriginatingAddress = messagesFromIntent[i2].getDisplayOriginatingAddress();
                if (displayOriginatingAddress != null) {
                    if (!this.f152500d.contains(displayOriginatingAddress)) {
                        List list = this.f152501e;
                        int size = list.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size) {
                                break;
                            }
                            int i4 = i3 + 1;
                            if (((Pattern) list.get(i3)).matcher(displayOriginatingAddress).find()) {
                                z = true;
                                break;
                            }
                            i3 = i4;
                        }
                    } else {
                        z = true;
                    }
                    if (z || !cdxz.f181891a.mo6606a().mo78437f()) {
                        matcher = compile.matcher(messagesFromIntent[i2].getDisplayMessageBody());
                        while (matcher.find()) {
                            arrayList.add(matcher.group());
                        }
                        if (arrayList.isEmpty()) {
                            break;
                        }
                    }
                    i2++;
                }
                z = false;
                if (z) {
                    i2++;
                }
                matcher = compile.matcher(messagesFromIntent[i2].getDisplayMessageBody());
                while (matcher.find()) {
                }
                if (arrayList.isEmpty()) {
                }
            }
            if (!arrayList.isEmpty()) {
                mo72408a(arrayList, z);
            }
        }
    }

    /* renamed from: a */
    public final void mo72408a(List list, boolean z) {
        if (!this.f152499b) {
            f152497c.mo25420f("Trying to unregister for sms broadcast receiving, but no receiver isregistered", new Object[0]);
        } else {
            this.f152498a.unregisterReceiver(this);
            this.f152499b = false;
        }
        if (list != null) {
            brlb brlb = this.f152502f;
            snr snr = brlb.f142905b.f142911b;
            snr.sendMessage(snr.obtainMessage(2, new Object[]{brlb.f142904a, list.get(0), Boolean.valueOf(z)}));
        }
    }
}

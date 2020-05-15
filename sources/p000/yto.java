package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import java.util.concurrent.TimeUnit;

/* renamed from: yto */
final /* synthetic */ class yto implements Runnable {

    /* renamed from: a */
    private final ytp f54607a;

    /* renamed from: b */
    private final Context f54608b;

    /* renamed from: c */
    private final bpgr f54609c;

    /* renamed from: d */
    private final String f54610d;

    public yto(ytp ytp, Context context, bpgr bpgr, String str) {
        this.f54607a = ytp;
        this.f54608b = context;
        this.f54609c = bpgr;
        this.f54610d = str;
    }

    public final void run() {
        SharedPreferences sharedPreferences;
        ytr ytr;
        ytp ytp = this.f54607a;
        Context context = this.f54608b;
        bpgr bpgr = this.f54609c;
        String str = this.f54610d;
        ytl ytl = ytl.INSTANCE;
        rjx rjx = ytp.f54611a;
        String str2 = bpgr.f137529b;
        if (!str2.startsWith("com.google.") && bmxi.m108538a(context.getPackageManager().getInstallerPackageName(str2), "com.android.vending") && ytl.mo30753a(rjx)) {
            SharedPreferences a = ytl.m44779a(context);
            long currentTimeMillis = System.currentTimeMillis();
            String str3 = bpgr.f137529b;
            String valueOf = String.valueOf(str3);
            int i = a.getInt(valueOf.length() == 0 ? new String("count-") : "count-".concat(valueOf), 0);
            String valueOf2 = String.valueOf(str3);
            String str4 = "count-";
            long j = a.getLong(valueOf2.length() == 0 ? new String("earliest-") : "earliest-".concat(valueOf2), 0);
            String valueOf3 = String.valueOf(str3);
            String string = a.getString(valueOf3.length() == 0 ? new String("events-") : "events-".concat(valueOf3), "");
            String str5 = str;
            if (!string.isEmpty()) {
                sharedPreferences = a;
                if (currentTimeMillis - j <= TimeUnit.DAYS.toMillis(1)) {
                    if (((long) i) < cdza.f181994a.mo6606a().mo78532g()) {
                        try {
                            ytr = (ytr) bxvk.m124016a(ytr.f54614b, Base64.decode(string, 0), bxus.m123743b());
                        } catch (bxwf e) {
                            ytr = ytr.f54614b;
                        }
                        if (!ytr.f54616a.contains(bpgr)) {
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            String valueOf4 = String.valueOf(str3);
                            SharedPreferences.Editor putInt = edit.putInt(valueOf4.length() == 0 ? new String(str4) : str4.concat(valueOf4), i + 1);
                            String valueOf5 = String.valueOf(str3);
                            String str6 = valueOf5.length() == 0 ? new String("events-") : "events-".concat(valueOf5);
                            bxvd bxvd = (bxvd) ytr.mo74142c(5);
                            bxvd.mo73625a((bxvk) ytr);
                            bxvd.mo73998a(bpgr);
                            putInt.putString(str6, ytl.m44780a((ytr) bxvd.mo74062i())).apply();
                            ytq a2 = ytp.mo30767a(context);
                            a2.mo30755a(418);
                            a2.mo30762a(str5);
                            a2.mo30758a(bpgr);
                            a2.mo30754a();
                        }
                        return;
                    }
                    return;
                }
            } else {
                sharedPreferences = a;
            }
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            String valueOf6 = String.valueOf(str3);
            SharedPreferences.Editor putInt2 = edit2.putInt(valueOf6.length() == 0 ? new String(str4) : str4.concat(valueOf6), 1);
            String valueOf7 = String.valueOf(str3);
            SharedPreferences.Editor putLong = putInt2.putLong(valueOf7.length() == 0 ? new String("earliest-") : "earliest-".concat(valueOf7), currentTimeMillis);
            String valueOf8 = String.valueOf(str3);
            String str7 = valueOf8.length() == 0 ? new String("events-") : "events-".concat(valueOf8);
            bxvd da = ytr.f54614b.mo74144da();
            da.mo73998a(bpgr);
            putLong.putString(str7, ytl.m44780a((ytr) da.mo74062i())).apply();
            ytq a22 = ytp.mo30767a(context);
            a22.mo30755a(418);
            a22.mo30762a(str5);
            a22.mo30758a(bpgr);
            a22.mo30754a();
        }
    }
}

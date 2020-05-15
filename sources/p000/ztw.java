package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: ztw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ztw implements Callable {

    /* renamed from: a */
    final /* synthetic */ ztx f55908a;

    public ztw(ztx ztx) {
        this.f55908a = ztx;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        ztk ztk;
        String str;
        String str2;
        zsu a;
        Throwable th;
        caah caah;
        String str3;
        caae caae;
        String str4 = "timestamp";
        String str5 = "accuracy_mode";
        String str6 = "data_source_id";
        ztk b = this.f55908a.f55910a.mo31503b();
        try {
            b.mo31497a();
            ztk ztk2 = b;
            try {
                str = "app_package";
                str2 = "realm";
                ztk = ztk2;
                throw th;
            } catch (Throwable th2) {
                th = th2;
                ztk = ztk2;
                Throwable th3 = th;
                try {
                    ztk.close();
                } catch (Throwable th4) {
                    bqye.m113761a(th3, th4);
                }
                throw th3;
            }
            try {
                a = ztk.mo31491a(ztc.f55865b, new String[]{"app_package", "sampling_delay", "Subscriptions.data_type_id", str6, str5, str4, "realm", String.format("%s.%s AS %s", "DataTypes", "name", "DataType_name"), String.format("%s.%s AS %s", "DataTypes", "proto", "DataType_proto"), String.format("%s.%s AS %s", "DataSources", "_id", "DataSource_id"), String.format("%s.%s AS %s", "DataSources", "identifier", "DataSource_identifier"), String.format("%s.%s AS %s", "DataSources", "proto", "DataSource_proto")});
                bnid a2 = bnig.m109513a();
                while (a.mo31476c()) {
                    String f = a.mo31481f(str);
                    str = str;
                    long d = a.mo31479d("sampling_delay");
                    int b2 = a.mo31472b(str5);
                    long d2 = a.mo31479d(str4);
                    String str7 = str4;
                    if (a.mo31475c("data_type_id") != null) {
                        caah = ztu.m46327a(a, "DataType_name", "DataType_proto");
                    } else {
                        caah = null;
                    }
                    if (a.mo31475c(str6) != null) {
                        str3 = str5;
                        caae = ztu.m46326a(ztk, a, "DataSource_id", "DataSource_identifier", "DataSource_proto");
                    } else {
                        str3 = str5;
                        caae = null;
                    }
                    String str8 = str6;
                    yyn yyn = new yyn();
                    yyn.f54825a = caae;
                    yyn.f54826b = caah;
                    yyn.f54827c = TimeUnit.MICROSECONDS.toMicros(d);
                    if (b2 != 1) {
                        if (b2 != 3) {
                            b2 = 2;
                        }
                    }
                    yyn.f54828d = b2;
                    cadr a3 = yyn.mo30864a();
                    String str9 = str2;
                    int b3 = a.mo31472b(str9);
                    int i = 2;
                    int[] iArr = {1, 2};
                    int i2 = 0;
                    while (i2 < i) {
                        int i3 = iArr[i2];
                        if (i3 == 0) {
                            throw null;
                        } else if (i3 == b3) {
                            a2.mo67758a(f, new yqe(f, a3, i3, null, d2));
                            str2 = str9;
                            str4 = str7;
                            str5 = str3;
                            str6 = str8;
                        } else {
                            i2++;
                            i = 2;
                        }
                    }
                    throw new IllegalArgumentException("bad SubscriptionType value");
                }
                ztk.mo31498b();
                bnig a4 = a2.mo67757a();
                if (a != null) {
                    a.close();
                }
                ztk.close();
                return a4;
            } catch (Throwable th5) {
                th = th5;
                Throwable th32 = th;
                ztk.close();
                throw th32;
            }
        } catch (Throwable th6) {
            th = th6;
            ztk = b;
            Throwable th322 = th;
            ztk.close();
            throw th322;
        }
    }
}

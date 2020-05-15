package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Pair;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;

/* renamed from: aezb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aezb implements aeyq {

    /* renamed from: a */
    private static avua f64029a;

    /* renamed from: b */
    private final PackageManager f64030b;

    /* renamed from: c */
    private final ActivityManager f64031c;

    /* renamed from: d */
    private final bosx f64032d;

    public aezb(Context context, bosx bosx) {
        this.f64031c = (ActivityManager) context.getSystemService("activity");
        this.f64032d = bosx;
        this.f64030b = context.getPackageManager();
    }

    /* renamed from: a */
    public final aeyp mo34658a(long j) {
        int a = (int) cfbx.f183603a.mo6606a().mo80819a();
        ArrayList arrayList = new ArrayList(a);
        int i = -1;
        for (ActivityManager.RunningTaskInfo runningTaskInfo : this.f64031c.getRunningTasks(a)) {
            i++;
            bxvd da = bojq.f133321m.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bojq bojq = (bojq) da.f164949b;
            int i2 = bojq.f133323a | 4;
            bojq.f133323a = i2;
            bojq.f133325c = j;
            bojq.f133323a = i2 | 32;
            bojq.f133326d = i;
            if (runningTaskInfo.baseActivity != null) {
                bojp a2 = aeyy.m52703a(runningTaskInfo.baseActivity);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bojq bojq2 = (bojq) da.f164949b;
                a2.getClass();
                bojq2.f133327e = a2;
                bojq2.f133323a |= 64;
            }
            if (runningTaskInfo.description != null) {
                String charSequence = runningTaskInfo.description.toString();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bojq bojq3 = (bojq) da.f164949b;
                charSequence.getClass();
                bojq3.f133323a |= 128;
                bojq3.f133328f = charSequence;
            }
            int i3 = runningTaskInfo.id;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bojq bojq4 = (bojq) da.f164949b;
            bojq4.f133323a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bojq4.f133329g = i3;
            int i4 = runningTaskInfo.numActivities;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bojq bojq5 = (bojq) da.f164949b;
            bojq5.f133323a |= 512;
            bojq5.f133330h = i4;
            int i5 = runningTaskInfo.numRunning;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bojq bojq6 = (bojq) da.f164949b;
            bojq6.f133323a |= 1024;
            bojq6.f133331i = i5;
            if (runningTaskInfo.topActivity != null) {
                bojp a3 = aeyy.m52703a(runningTaskInfo.topActivity);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bojq bojq7 = (bojq) da.f164949b;
                a3.getClass();
                bojq7.f133332j = a3;
                bojq7.f133323a |= 2048;
            }
            bojq bojq8 = (bojq) da.f164949b;
            if ((bojq8.f133323a & 2048) != 0) {
                bojp bojp = bojq8.f133332j;
                if (bojp == null) {
                    bojp = bojp.f133316d;
                }
                if ((bojp.f133318a & 1) != 0) {
                    try {
                        PackageManager packageManager = this.f64030b;
                        bojp bojp2 = ((bojq) da.f164949b).f133332j;
                        if (bojp2 == null) {
                            bojp2 = bojp.f133316d;
                        }
                        PackageInfo packageInfo = packageManager.getPackageInfo(bojp2.f133319b, 0);
                        int i6 = packageInfo.versionCode;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bojq bojq9 = (bojq) da.f164949b;
                        bojq9.f133323a |= 8192;
                        bojq9.f133333k = i6;
                        String a4 = stm.m36299a(packageInfo.versionName);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bojq bojq10 = (bojq) da.f164949b;
                        a4.getClass();
                        bojq10.f133323a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                        bojq10.f133334l = a4;
                    } catch (PackageManager.NameNotFoundException e) {
                    } catch (RuntimeException e2) {
                        if (!e2.getClass().getName().equals("java.lang.RuntimeException")) {
                            throw e2;
                        }
                    }
                }
            }
            bojq bojq11 = (bojq) da.mo74062i();
            bxvd bxvd = (bxvd) bojq11.mo74142c(5);
            bxvd.mo73625a((bxvk) bojq11);
            bosx bosx = this.f64032d;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bojq bojq12 = (bojq) bxvd.f164949b;
            bosx.getClass();
            bojq12.f133324b = bosx;
            bojq12.f133323a |= 1;
            arrayList.add(Pair.create("LB_T", (bojq) bxvd.mo74062i()));
        }
        return new aeyz(arrayList.iterator());
    }

    /* renamed from: b */
    public final boolean mo34661b() {
        return true;
    }

    /* renamed from: a */
    public final avua mo34659a() {
        if (f64029a == null) {
            f64029a = new aeza();
        }
        return f64029a;
    }

    /* renamed from: a */
    public final String mo34660a(bxxc bxxc) {
        bojq bojq = (bojq) bxxc;
        if ((bojq.f133323a & 2048) == 0) {
            return "";
        }
        bojp bojp = bojq.f133332j;
        if (bojp == null) {
            bojp = bojp.f133316d;
        }
        return bojp.f133319b;
    }
}

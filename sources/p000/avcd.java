package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: avcd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avcd {

    /* renamed from: a */
    private static final bnic f92948a = bnic.m109490a((Object) 9, (Object) 10);

    /* renamed from: b */
    private final Context f92949b;

    /* renamed from: c */
    private final Account f92950c;

    /* renamed from: d */
    private final avce f92951d;

    public avcd(Context context, Account account) {
        this.f92949b = context;
        this.f92950c = account;
        this.f92951d = avce.m78238a(context);
    }

    /* renamed from: a */
    static bxrq m78232a(bxsl bxsl, boolean z) {
        int i;
        bxvd da = bxrq.f164586f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxrq bxrq = (bxrq) da.f164949b;
        bxrq.f164590c = 1;
        int i2 = bxrq.f164588a | 2;
        bxrq.f164588a = i2;
        int i3 = bxsl.f164712l;
        int i4 = i2 | 1;
        bxrq.f164588a = i4;
        bxrq.f164589b = i3;
        if (!z) {
            i = 4;
        } else {
            i = 3;
        }
        bxrq.f164591d = i - 1;
        bxrq.f164588a = i4 | 4;
        bxvd da2 = bxrn.f164579e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bxrn bxrn = (bxrn) da2.f164949b;
        int i5 = bxrn.f164581a | 1;
        bxrn.f164581a = i5;
        bxrn.f164582b = true;
        int i6 = i5 | 2;
        bxrn.f164581a = i6;
        bxrn.f164583c = true;
        bxrn.f164581a = 4 | i6;
        bxrn.f164584d = true;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxrq bxrq2 = (bxrq) da.f164949b;
        bxrn bxrn2 = (bxrn) da2.mo74062i();
        bxrn2.getClass();
        bxrq2.f164592e = bxrn2;
        bxrq2.f164588a |= 8;
        return (bxrq) da.mo74062i();
    }

    /* renamed from: b */
    public final Set mo51144b() {
        return !mo51145c() ? Collections.EMPTY_SET : f92948a;
    }

    /* renamed from: c */
    public final boolean mo51145c() {
        return !sre.m36080a(this.f92949b);
    }

    /* renamed from: a */
    public final List mo51142a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m78232a(bxsl.SUPPL_WEB_AND_APP_DEVICE_LEVEL, this.f92951d.mo51147a(this.f92950c.name, 10)));
        arrayList.add(m78232a(bxsl.DEVICE_INFO_DEVICE_LEVEL, this.f92951d.mo51147a(this.f92950c.name, 9)));
        return arrayList;
    }

    /* renamed from: a */
    public final void mo51143a(bxsd[] bxsdArr) {
        int a;
        boolean z;
        int i;
        int a2;
        bxsd[] bxsdArr2 = bxsdArr;
        ArrayList arrayList = new ArrayList();
        for (bxsd bxsd : bxsdArr2) {
            int i2 = bxsd.f164667b;
            if ((i2 == 10 || i2 == 9) && (((a = bxsn.m123069a(bxsd.f164668c)) != 0 && a == 3) || ((a2 = bxsn.m123069a(bxsd.f164668c)) != 0 && a2 == 4))) {
                avce avce = this.f92951d;
                String str = this.f92950c.name;
                int i3 = bxsd.f164667b;
                int a3 = bxsn.m123069a(bxsd.f164668c);
                if (a3 == 0) {
                    z = false;
                } else {
                    z = a3 == 3;
                }
                synchronized (avce.f92955b) {
                    if (avce.mo51149b(str, i3) != z) {
                        long currentTimeMillis = System.currentTimeMillis();
                        SharedPreferences.Editor edit = avce.f92955b.edit();
                        edit.putBoolean(avce.m78240c(str, i3), z);
                        edit.putLong(avce.m78241d(str, i3), currentTimeMillis);
                        edit.apply();
                    }
                }
                arrayList.add(Integer.valueOf(bxsd.f164667b));
                int i4 = bxsd.f164667b;
                if (i4 == 9) {
                    i = 7;
                } else if (i4 != 10) {
                    i = null;
                } else {
                    i = 8;
                }
                if (i != null) {
                    arrayList.add(i);
                }
            }
        }
        int[] iArr = new int[arrayList.size()];
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            iArr[i5] = ((Integer) arrayList.get(i5)).intValue();
        }
        sbv.m34875a(this.f92949b, this.f92950c.name, iArr);
    }
}

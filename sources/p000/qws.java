package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: qws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qws {
    @Deprecated

    /* renamed from: a */
    public static final rjo f42331a = new rjo("ClearcutLogger.API", f42337t, f42336s);

    /* renamed from: b */
    public static final String[] f42332b = new String[0];

    /* renamed from: c */
    public static final byte[][] f42333c = new byte[0][];

    /* renamed from: d */
    public static volatile int f42334d = -1;

    /* renamed from: q */
    public static final List f42335q = new CopyOnWriteArrayList();

    /* renamed from: s */
    public static final rje f42336s = new rje();

    /* renamed from: t */
    public static final rjl f42337t = new qwm();

    /* renamed from: e */
    public final Context f42338e;

    /* renamed from: f */
    public final String f42339f;

    /* renamed from: g */
    public String f42340g;

    /* renamed from: h */
    public int f42341h;

    /* renamed from: i */
    public String f42342i;

    /* renamed from: j */
    public String f42343j;

    /* renamed from: k */
    public final boolean f42344k;

    /* renamed from: l */
    public bxsw f42345l;

    /* renamed from: m */
    public cagz f42346m;

    /* renamed from: n */
    final qwt f42347n;

    /* renamed from: o */
    public qwr f42348o;

    /* renamed from: p */
    public final qwp f42349p;

    /* renamed from: r */
    public final List f42350r;

    public qws(Context context, int i, String str, String str2, String str3, boolean z, qwt qwt, qwr qwr, qwp qwp) {
        boolean z2;
        this.f42341h = -1;
        this.f42345l = null;
        this.f42346m = cagz.DEFAULT;
        this.f42350r = new CopyOnWriteArrayList();
        this.f42338e = context.getApplicationContext();
        this.f42339f = context.getPackageName();
        this.f42341h = i;
        this.f42340g = str;
        this.f42342i = str2;
        this.f42343j = str3;
        this.f42344k = z;
        this.f42347n = qwt;
        this.f42348o = qwr == null ? new qwr() : qwr;
        this.f42346m = cagz.DEFAULT;
        this.f42349p = qwp;
        if (z) {
            if (str2 == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            sdo.m34975b(z2, "can't be anonymous with an upload account");
        }
    }

    /* renamed from: a */
    public static String m33018a(Iterable iterable) {
        return iterable != null ? bmxr.m108544a(", ").mo66874a(iterable) : "null";
    }

    /* renamed from: a */
    public static qws m33019a(Context context, String str) {
        return new qws(context, -1, str, null, null, true, rav.m33200a(context), null, new rbl(context));
    }

    /* renamed from: a */
    public static int[] m33020a(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            iArr[i2] = ((Integer) arrayList.get(i)).intValue();
            i++;
            i2++;
        }
        return iArr;
    }

    /* renamed from: a */
    public final qwo mo24333a(bxxc bxxc) {
        return new qwo(this, new qwl(bxxc));
    }

    public qws(Context context, String str, String str2) {
        this(context, -1, str, str2, null, false, rav.m33200a(context), null, new rbl(context));
    }

    /* renamed from: a */
    public final qwo mo24334a(qwq qwq) {
        return new qwo(this, qwq);
    }

    /* renamed from: a */
    public final qwo mo24335a(byte[] bArr) {
        bxtx bxtx;
        if (bArr != null) {
            bxtx = bxtx.m123261a(bArr);
        } else {
            bxtx = null;
        }
        return new qwo(this, bxtx, null);
    }

    /* renamed from: a */
    public final void mo24336a(long j, TimeUnit timeUnit) {
        this.f42347n.mo24339a(j, timeUnit);
    }

    /* renamed from: a */
    public final void mo24337a(cagz cagz) {
        if (cagz == null) {
            cagz = cagz.DEFAULT;
        }
        this.f42346m = cagz;
    }
}

package p000;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.util.Pair;

/* renamed from: alor */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class alor extends alot {
    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final alos mo40609c(Context context) {
        Pair pair;
        byte[] d = mo40621d(context);
        if (d == alot.f73983c || d == null) {
            return alos.f73973a;
        }
        if (d == alot.f73984d) {
            return alos.f73974b;
        }
        if (cgbe.m144183l()) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(d, 0, d.length, options);
            pair = Pair.create(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
        } else {
            pair = Pair.create(-1, -1);
        }
        anco[] a = ancp.f76639a.mo41706a();
        anco anco = a[0];
        anco anco2 = a[1];
        try {
            sdo.m34959a(anco2);
            sdo.m34959a(d);
            ancy.m64052a(new aloq(anco2, d));
            return alos.m61435a(anco, ((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), false);
        } catch (Exception e) {
            srz.m36171a(anco);
            srz.m36171a(anco2);
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract byte[] mo40621d(Context context);

    public alor(String str, int i, almp almp, String str2) {
        super(str, i, almp, str2);
    }

    protected alor(String str, int i, almp almp, String str2, byte[] bArr) {
        super(str, i, almp, str2);
    }
}

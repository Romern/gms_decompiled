package p000;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import android.util.Pair;

/* renamed from: alov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class alov extends alot {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public alov(String str, String str2, int i, almp almp, String str3) {
        super(str, !((Boolean) amgs.f74895a.mo41191a()).booleanValue() ? null : str2, i, almp, str3);
        amig.m62939a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final alos mo40609c(Context context) {
        Pair pair;
        anco anco;
        anco anco2;
        anci d = mo40624d(context);
        if (d == null) {
            return alos.f73973a;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptor = d.f76623a;
            anco anco3 = null;
            if (cgbe.m144183l()) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor(), null, options);
                pair = Pair.create(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
            } else {
                pair = Pair.create(-1, -1);
            }
            boolean cy = cgbe.f186279a.mo6606a().mo83427cy();
            ParcelFileDescriptor parcelFileDescriptor2 = d.f76624b;
            if (parcelFileDescriptor2 != null) {
                if (!cy) {
                    anco[] a = ancp.f76639a.mo41706a();
                    anco = a[0];
                    anco2 = a[1];
                    sdo.m34959a(anco2);
                    sdo.m34959a(parcelFileDescriptor2);
                    ancy.m64052a(new alou(parcelFileDescriptor2, anco2, (int) cgbe.f186279a.mo6606a().mo83300ad()));
                    anco3 = anco;
                } else {
                    anco3 = new anco(parcelFileDescriptor2);
                }
            }
            alos a2 = alos.m61435a(anco3, ((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), cy);
            srz.m36170a(d.f76623a);
            return a2;
        } catch (Exception e) {
            srz.m36171a(anco);
            srz.m36171a(anco2);
            throw e;
        } catch (Exception e2) {
            try {
                srz.m36170a(d.f76624b);
                throw e2;
            } catch (Throwable th) {
                srz.m36170a(d.f76623a);
                throw th;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract anci mo40624d(Context context);
}

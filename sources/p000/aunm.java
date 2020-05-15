package p000;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import java.lang.ref.WeakReference;

/* renamed from: aunm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aunm extends aunc {

    /* renamed from: c */
    private static WeakReference f92154c = new WeakReference(null);

    public aunm(Context context) {
        super(context, aunq.f92162b);
    }

    /* renamed from: b */
    public static synchronized aunm m77396b() {
        aunm aunm;
        synchronized (aunm.class) {
            aunm = (aunm) f92154c.get();
            if (aunm == null) {
                aunm = new aunm(rpr.m34216b());
                f92154c = new WeakReference(aunm);
            }
        }
        return aunm;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ SQLiteOpenHelper mo50697a() {
        return aunl.m77395a();
    }
}

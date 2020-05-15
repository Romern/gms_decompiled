package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import java.lang.ref.WeakReference;

/* renamed from: fzs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fzs {

    /* renamed from: a */
    private static final SparseArray f17749a = new SparseArray();

    /* renamed from: b */
    private static final SparseArray f17750b = new SparseArray();

    /* renamed from: a */
    public static Drawable m12827a(Context context, int i, int i2, boolean z) {
        SparseArray sparseArray;
        Resources resources;
        if (i == 0) {
            return null;
        }
        String packageName = context.getPackageName();
        if (!z || TextUtils.isEmpty(packageName)) {
            sparseArray = f17749a;
            resources = context.getResources();
        } else {
            sparseArray = f17750b;
            try {
                Context createPackageContext = context.createPackageContext(packageName, 0);
                resources = createPackageContext != null ? createPackageContext.getResources() : null;
            } catch (PackageManager.NameNotFoundException e) {
                return null;
            }
        }
        if (resources == null) {
            return null;
        }
        SparseArray sparseArray2 = (SparseArray) sparseArray.get(i);
        if (sparseArray2 == null) {
            sparseArray2 = new SparseArray();
            sparseArray.put(i, sparseArray2);
        }
        WeakReference weakReference = (WeakReference) sparseArray2.get(i2);
        if (weakReference == null || weakReference.get() == null) {
            try {
                Drawable mutate = resources.getDrawable(i).mutate();
                int i3 = Build.VERSION.SDK_INT;
                C1173lt.m19599a(mutate, i2);
                weakReference = new WeakReference(mutate);
                sparseArray2.put(i2, weakReference);
            } catch (Resources.NotFoundException e2) {
                return null;
            }
        }
        return (Drawable) weakReference.get();
    }
}

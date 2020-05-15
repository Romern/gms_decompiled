package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.badge.BadgeDrawable$SavedState;
import com.google.android.material.internal.ParcelableSparseArray;
import java.lang.ref.WeakReference;

/* renamed from: bhen */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhen {

    /* renamed from: a */
    public static final /* synthetic */ int f118404a = 0;

    static {
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public static SparseArray m100722a(Context context, ParcelableSparseArray parcelableSparseArray) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray(parcelableSparseArray.size());
        int i = 0;
        while (i < parcelableSparseArray.size()) {
            int keyAt = parcelableSparseArray.keyAt(i);
            BadgeDrawable$SavedState badgeDrawable$SavedState = (BadgeDrawable$SavedState) parcelableSparseArray.valueAt(i);
            if (badgeDrawable$SavedState != null) {
                bhem bhem = new bhem(context);
                int i2 = badgeDrawable$SavedState.f151047e;
                BadgeDrawable$SavedState badgeDrawable$SavedState2 = bhem.f118391d;
                if (badgeDrawable$SavedState2.f151047e != i2) {
                    badgeDrawable$SavedState2.f151047e = i2;
                    double d = (double) i2;
                    Double.isNaN(d);
                    bhem.f118392e = ((int) Math.pow(10.0d, d - 4.0d)) - 1;
                    bhem.f118390c.mo63896a();
                    bhem.mo63612d();
                    bhem.invalidateSelf();
                }
                int i3 = badgeDrawable$SavedState.f151046d;
                if (i3 != -1) {
                    int max = Math.max(0, i3);
                    BadgeDrawable$SavedState badgeDrawable$SavedState3 = bhem.f118391d;
                    if (badgeDrawable$SavedState3.f151046d != max) {
                        badgeDrawable$SavedState3.f151046d = max;
                        bhem.f118390c.mo63896a();
                        bhem.mo63612d();
                        bhem.invalidateSelf();
                    }
                }
                int i4 = badgeDrawable$SavedState.f151043a;
                bhem.f118391d.f151043a = i4;
                ColorStateList valueOf = ColorStateList.valueOf(i4);
                if (bhem.f118389b.mo63955i() != valueOf) {
                    bhem.f118389b.mo63948c(valueOf);
                    bhem.invalidateSelf();
                }
                int i5 = badgeDrawable$SavedState.f151044b;
                bhem.f118391d.f151044b = i5;
                if (bhem.f118390c.f118902a.getColor() != i5) {
                    bhem.f118390c.f118902a.setColor(i5);
                    bhem.invalidateSelf();
                }
                int i6 = badgeDrawable$SavedState.f151050h;
                BadgeDrawable$SavedState badgeDrawable$SavedState4 = bhem.f118391d;
                if (badgeDrawable$SavedState4.f151050h != i6) {
                    badgeDrawable$SavedState4.f151050h = i6;
                    WeakReference weakReference = bhem.f118393f;
                    if (!(weakReference == null || weakReference.get() == null)) {
                        View view = (View) bhem.f118393f.get();
                        WeakReference weakReference2 = bhem.f118394g;
                        if (weakReference2 != null) {
                            viewGroup = (ViewGroup) weakReference2.get();
                        } else {
                            viewGroup = null;
                        }
                        bhem.mo63608a(view, viewGroup);
                    }
                }
                bhem.f118391d.f151051i = badgeDrawable$SavedState.f151051i;
                bhem.mo63612d();
                bhem.f118391d.f151052j = badgeDrawable$SavedState.f151052j;
                bhem.mo63612d();
                sparseArray.put(keyAt, bhem);
                i++;
            } else {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
        }
        return sparseArray;
    }

    /* renamed from: b */
    public static void m100726b(bhem bhem, View view) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        bhem.setBounds(rect);
        bhem.mo63608a(view, null);
    }

    /* renamed from: a */
    public static ParcelableSparseArray m100723a(SparseArray sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        int i = 0;
        while (i < sparseArray.size()) {
            int keyAt = sparseArray.keyAt(i);
            bhem bhem = (bhem) sparseArray.valueAt(i);
            if (bhem != null) {
                parcelableSparseArray.put(keyAt, bhem.f118391d);
                i++;
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        return parcelableSparseArray;
    }

    /* renamed from: a */
    public static void m100724a(Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }

    /* renamed from: a */
    public static void m100725a(bhem bhem, View view) {
        if (bhem != null) {
            view.getOverlay().remove(bhem);
        }
    }
}

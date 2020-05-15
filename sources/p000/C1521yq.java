package p000;

import android.content.Context;
import android.graphics.RectF;
import android.os.Build;
import android.support.p002v7.widget.AppCompatEditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: yq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1521yq {

    /* renamed from: a */
    public int f27671a = 0;

    /* renamed from: b */
    public float f27672b = -1.0f;

    /* renamed from: c */
    public float f27673c = -1.0f;

    /* renamed from: d */
    public float f27674d = -1.0f;

    /* renamed from: e */
    public int[] f27675e = new int[0];

    /* renamed from: f */
    public boolean f27676f = false;

    /* renamed from: g */
    public final TextView f27677g;

    /* renamed from: h */
    public final Context f27678h;

    static {
        new RectF();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public C1521yq(TextView textView) {
        this.f27677g = textView;
        this.f27678h = textView.getContext();
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public static final int[] m20882a(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0) {
                    Integer valueOf = Integer.valueOf(i);
                    if (Collections.binarySearch(arrayList, valueOf) < 0) {
                        arrayList.add(valueOf);
                    }
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    /* renamed from: a */
    public final boolean mo16572a() {
        return !(this.f27677g instanceof AppCompatEditText);
    }
}

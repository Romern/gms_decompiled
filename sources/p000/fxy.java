package p000;

import com.felicanetworks.mfc.BuildConfig;
import com.google.android.gms.appinvite.model.ContactPerson;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: fxy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fxy {

    /* renamed from: a */
    public final int[] f17567a;

    /* renamed from: b */
    private final boolean f17568b;

    /* renamed from: c */
    private final boolean f17569c;

    /* renamed from: d */
    private final Comparator f17570d = new fxx(this);

    public fxy(String[] strArr, boolean z, boolean z2) {
        String[] a = fzm.m12796a(strArr);
        this.f17567a = new int[]{m12703a(BuildConfig.FLAVOR_client, a), m12703a("email", a), m12703a("phone", a)};
        this.f17568b = z;
        this.f17569c = z2;
    }

    /* renamed from: a */
    private static int m12703a(String str, String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (str.equals(strArr[i])) {
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public final void mo11502a(List list) {
        if (cbwa.m128703b() && this.f17569c) {
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    list.clear();
                    break;
                }
                int i2 = i + 1;
                if (((ContactPerson.ContactMethod) list.get(i)).f9755a == 0) {
                    break;
                }
                i = i2;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i3 = ((ContactPerson.ContactMethod) it.next()).f9755a;
            int[] iArr = this.f17567a;
            int length = iArr.length;
            if (i3 >= length || iArr[i3] >= length) {
                it.remove();
            }
        }
        if (this.f17568b) {
            Collections.sort(list, this.f17570d);
        }
    }
}

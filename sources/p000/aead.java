package p000;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* renamed from: aead */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aead extends aeca {

    /* renamed from: a */
    public final Set f62980a;

    public aead(aeac aeac) {
        super(aeac);
        this.f62980a = Collections.unmodifiableSet(new C1225nr(aeac.f62979a));
    }

    /* renamed from: a */
    public static Set m51510a(int[] iArr, Parcelable[] parcelableArr) {
        int length;
        if (iArr == null || parcelableArr == null || (length = parcelableArr.length) != iArr.length) {
            throw new IllegalArgumentException("URI or Flag arrays are null or have different sizes.");
        }
        Uri[] uriArr = new Uri[length];
        System.arraycopy(parcelableArr, 0, uriArr, 0, length);
        C1225nr nrVar = new C1225nr(length);
        for (int i = 0; i < length; i++) {
            nrVar.add(new aeab(uriArr[i], iArr[i]));
        }
        return Collections.unmodifiableSet(nrVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aead) || !super.equals(obj) || !this.f62980a.equals(((aead) obj).f62980a)) {
            return false;
        }
        return true;
    }

    public aead(Bundle bundle) {
        super(bundle);
        this.f62980a = m51510a(bundle.getIntArray("content_uri_flags_array"), bundle.getParcelableArray("content_uri_array"));
    }

    /* renamed from: a */
    public final void mo33975a(Bundle bundle, int i) {
        super.mo33975a(bundle, i);
        int size = this.f62980a.size();
        int[] iArr = new int[size];
        Uri[] uriArr = new Uri[size];
        int i2 = 0;
        for (aeab aeab : this.f62980a) {
            iArr[i2] = aeab.f62978b;
            uriArr[i2] = aeab.f62977a;
            i2++;
        }
        bundle.putIntArray("content_uri_flags_array", iArr);
        bundle.putParcelableArray("content_uri_array", uriArr);
    }
}

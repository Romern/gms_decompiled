package p000;

import com.google.android.gms.people.internal.ParcelableLoadImageOptions;
import com.google.android.gms.people.model.AvatarReference;

/* renamed from: aloo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aloo extends alor {

    /* renamed from: a */
    protected final AvatarReference f73967a;

    /* renamed from: b */
    protected final ParcelableLoadImageOptions f73968b;

    public aloo(String str, int i, almp almp, AvatarReference avatarReference, ParcelableLoadImageOptions parcelableLoadImageOptions, String str2) {
        super(str, i, almp, str2);
        this.f73967a = avatarReference;
        this.f73968b = parcelableLoadImageOptions;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo40608a() {
        String valueOf = String.valueOf(this.f73967a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("[avatar ref=");
        sb.append(valueOf);
        sb.append("]");
        sb.toString();
    }
}

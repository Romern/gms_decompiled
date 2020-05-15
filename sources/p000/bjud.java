package p000;

import android.content.Context;
import com.google.android.chimera.AsyncTaskLoader;
import java.util.HashMap;

/* renamed from: bjud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjud extends AsyncTaskLoader {

    /* renamed from: a */
    String f123335a;

    /* renamed from: b */
    private final bmnj f123336b;

    public bjud(Context context, bmnj bmnj) {
        super(context);
        this.f123336b = bmnj;
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        String str = this.f123335a;
        if (str != null) {
            deliverResult(str);
        } else {
            forceLoad();
        }
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        vvq a = vvp.m41462a(getContext(), this.f123336b.f130110a);
        HashMap hashMap = new HashMap();
        bxwc bxwc = this.f123336b.f130111b;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bmni bmni = (bmni) bxwc.get(i);
            hashMap.put(bmni.f130105a, bmni.f130106b);
        }
        this.f123335a = a.mo28905a(hashMap);
        a.mo28907b();
        return this.f123335a;
    }
}

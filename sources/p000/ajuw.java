package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import java.util.Map;

/* renamed from: ajuw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajuw extends ajuk {

    /* renamed from: f */
    public final LruCache f71338f = new LruCache(10);

    /* renamed from: g */
    private final Map f71339g = new C1223np();

    /* renamed from: h */
    private final Map f71340h = new C1223np();

    private ajuw(Context context, ajur ajur) {
        super(context, ajur);
    }

    /* renamed from: a */
    public static ajuw m59073a(Context context, ajur ajur) {
        ajuw ajuw = new ajuw(context, ajur);
        ajuw.mo170a(true);
        return ajuw;
    }

    /* renamed from: c */
    private final long m59074c(ShareTarget shareTarget) {
        return this.f71340h.containsKey(shareTarget) ? ((Long) this.f71340h.get(shareTarget)).longValue() : shareTarget.f81028a;
    }

    /* renamed from: L */
    public final long mo157L(int i) {
        return m59074c((ShareTarget) mo38932f(i));
    }

    /* renamed from: b */
    public final TransferMetadata mo38951b(ShareTarget shareTarget) {
        if (this.f71339g.containsKey(shareTarget)) {
            return (TransferMetadata) this.f71339g.get(shareTarget);
        }
        return new ajub(0).mo38916a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ acm mo163a(ViewGroup viewGroup, int i) {
        return mo38946a(LayoutInflater.from(((ajuk) this).f71297a).inflate((int) C0126R.C0128layout.sharing_list_item_share_target, viewGroup, false));
    }

    /* renamed from: c */
    public final void mo38952c() {
        this.f71298d.clear();
        mo171aJ();
        this.f71339g.clear();
    }

    /* renamed from: a */
    public final ajuv mo38946a(View view) {
        return new ajuv(this, view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo38927a(ajuj ajuj) {
        ajuv ajuv = (ajuv) ajuj;
        ajuv.f71330s.setAlpha(0.0f);
        ajuv.f71330s.animate().alpha(1.0f).setInterpolator(new AccelerateInterpolator());
        akiu.m59855a(ajuv.f71331t, 0.3f);
        ajuv.f71331t.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new OvershootInterpolator());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ajuk.a(ajuj, int):void
     arg types: [ajuv, int]
     candidates:
      ajuw.a(android.content.Context, ajur):ajuw
      ajuw.a(android.view.ViewGroup, int):acm
      ajuw.a(acm, int):void
      ajuw.a(ajuv, int):void
      ajuw.a(com.google.android.gms.nearby.sharing.ShareTarget, com.google.android.gms.nearby.sharing.TransferMetadata):void
      ajuw.a(com.google.android.gms.nearby.sharing.ShareTarget, com.google.android.gms.nearby.sharing.ShareTarget):boolean
      ajuk.a(acm, int):void
      abh.a(android.view.ViewGroup, int):acm
      abh.a(int, java.lang.Object):void
      abh.a(acm, int):void
      ajuk.a(ajuj, int):void */
    /* renamed from: a */
    public final void mo38928a(ajuv ajuv, int i) {
        ShareTarget shareTarget = (ShareTarget) mo38932f(i);
        if (!shareTarget.equals(ajuv.f201a.getTag(C0126R.C0128layout.sharing_list_item_share_target)) || !mo38951b(shareTarget).equals(ajuv.f201a.getTag(C0126R.C0129id.progress_bar))) {
            super.mo168a((ajuj) ajuv, i);
            ajuv.f201a.setTag(C0126R.C0128layout.sharing_list_item_share_target, shareTarget.clone());
            ajuv.f201a.setTag(C0126R.C0129id.progress_bar, mo38951b(shareTarget).clone());
        }
    }

    /* renamed from: a */
    public final void mo38948a(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        this.f71339g.put(shareTarget, transferMetadata);
    }

    /* renamed from: a */
    public final boolean mo38949a(ShareTarget shareTarget) {
        int i = 0;
        while (i < mo161a()) {
            if (mo157L(i) != m59074c(shareTarget)) {
                i++;
            } else {
                mo38931b(i, shareTarget);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo38950a(ShareTarget shareTarget, ShareTarget shareTarget2) {
        int b = mo38930b((Object) shareTarget);
        if (b < 0) {
            return false;
        }
        mo38931b(b, shareTarget2);
        Drawable drawable = (Drawable) this.f71338f.remove(shareTarget);
        if (drawable != null) {
            this.f71338f.put(shareTarget2, drawable);
        }
        TransferMetadata transferMetadata = (TransferMetadata) this.f71339g.remove(shareTarget);
        if (transferMetadata != null) {
            this.f71339g.put(shareTarget2, transferMetadata);
        }
        long c = m59074c(shareTarget);
        this.f71340h.remove(shareTarget);
        this.f71340h.put(shareTarget2, Long.valueOf(c));
        return true;
    }
}

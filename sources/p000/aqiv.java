package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.setupservices.GoogleServicesChimeraActivity;
import com.google.android.gms.setupservices.item.GoogleServicesExpandableSwitchItem;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: aqiv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aqiv {

    /* renamed from: a */
    private final int f86180a;

    /* renamed from: f */
    public final int f86181f;

    /* renamed from: g */
    public aqiz f86182g;

    /* renamed from: h */
    public final int f86183h;

    public aqiv(int i, int i2, int i3) {
        this.f86181f = i;
        this.f86180a = i3;
        this.f86183h = i2;
    }

    /* renamed from: a */
    protected static final GoogleServicesExpandableSwitchItem m71684a(Context context, int i, int i2) {
        GoogleServicesExpandableSwitchItem googleServicesExpandableSwitchItem = new GoogleServicesExpandableSwitchItem(i);
        Drawable drawable = context.getDrawable(i2);
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTint(C1133kh.m17843b(context, C0126R.color.sud_list_item_icon_color_light));
        } else {
            GoogleServicesChimeraActivity.f107625c.mo25420f("Unexpected null icon for expandable switch", new Object[0]);
        }
        googleServicesExpandableSwitchItem.mo71394a(drawable);
        return googleServicesExpandableSwitchItem;
    }

    /* renamed from: a */
    public abstract aucb mo47888a();

    /* renamed from: a */
    public void mo47889a(bsqv bsqv) {
    }

    /* renamed from: a */
    public abstract void mo47890a(boolean z);

    /* renamed from: b */
    public abstract boolean mo47891b();

    /* renamed from: c */
    public bizy mo47892c() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract aqiz mo47893d();

    /* renamed from: e */
    public final String mo47897e() {
        String valueOf = String.valueOf(Integer.toString(this.f86183h - 1));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
        sb.append("opt_in_");
        sb.append(valueOf);
        return sb.toString();
    }

    /* renamed from: a */
    public final int mo47896a(bxvd bxvd) {
        bofd bofd = ((boct) bxvd.f164949b).f132626q;
        if (bofd == null) {
            bofd = bofd.f132880b;
        }
        bxwc bxwc = bofd.f132882a;
        int size = bxwc.size();
        int i = 0;
        while (true) {
            int i2 = 1;
            if (i >= size) {
                bxvd da = bofc.f132873f.mo74144da();
                int i3 = this.f86180a;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bofc bofc = (bofc) da.f164949b;
                bofc.f132876b = i3 - 1;
                bofc.f132875a |= 1;
                bofc bofc2 = (bofc) da.mo74062i();
                bofd bofd2 = ((boct) bxvd.f164949b).f132626q;
                if (bofd2 == null) {
                    bofd2 = bofd.f132880b;
                }
                bxvd bxvd2 = (bxvd) bofd2.mo74142c(5);
                bxvd2.mo73625a((bxvk) bofd2);
                boez boez = (boez) bxvd2;
                if (boez.f164950c) {
                    boez.mo74035c();
                    boez.f164950c = false;
                }
                bofd bofd3 = (bofd) boez.f164949b;
                bofc2.getClass();
                bofd3.mo68905a();
                bofd3.f132882a.add(bofc2);
                bofd bofd4 = (bofd) boez.mo74062i();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                boct boct = (boct) bxvd.f164949b;
                boct boct2 = boct.f132600I;
                bofd4.getClass();
                boct.f132626q = bofd4;
                boct.f132610a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                return size;
            }
            int a = bofb.m111137a(((bofc) bxwc.get(i)).f132876b);
            if (a != 0) {
                i2 = a;
            }
            if (i2 == this.f86180a) {
                return i;
            }
            i++;
        }
    }
}

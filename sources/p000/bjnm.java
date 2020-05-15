package p000;

import android.content.ContextWrapper;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: bjnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjnm extends bjhu implements ciqx {

    /* renamed from: m */
    bwsf f123014m;

    /* renamed from: p */
    ahi f123015p;

    /* renamed from: q */
    ahm f123016q;

    /* renamed from: r */
    boolean f123017r;

    public bjnm(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* renamed from: G */
    public final void mo65398G() {
        this.f123015p = null;
        this.f123016q = null;
    }

    /* renamed from: a */
    public final void mo65399a(ahi ahi) {
        Parcel obtain;
        Parcel obtain2;
        this.f123015p = ahi;
        this.f123016q = ahi.mo702a(new bjnl());
        try {
            C0995fp fpVar = ahi.f541a;
            obtain = Parcel.obtain();
            obtain2 = Parcel.obtain();
            obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            obtain.writeLong(0);
            fpVar.f17053a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.readInt();
            obtain2.recycle();
            obtain.recycle();
        } catch (RemoteException e) {
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        this.f123017r = true;
        ahj ahj = new ahj(this.f123016q);
        ahj.mo705b();
        ahj.mo704a(-1);
        ahk a = ahj.mo703a();
        ciqv.m150908a(this.f122639a.f122692a.f122732i, a.f545a);
        a.f545a.setFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        a.mo706a(this.f122639a.f122692a.f122732i, Uri.parse(this.f123014m.f160854a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo65258u() {
        if (!this.f123017r) {
            ContextWrapper contextWrapper = this.f122639a.f122692a.f122732i;
            String a = ciqv.m150907a(contextWrapper);
            String str = this.f123014m.f160854a;
            if ((!URLUtil.isHttpUrl(str) && !URLUtil.isHttpsUrl(str)) || TextUtils.isEmpty(a) || !ahi.m752a(contextWrapper, a, new ciqw(this))) {
                mo65256s();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo65259v() {
        this.f123017r = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: cG */
    public final void mo65086cG() {
        super.mo65257t();
        if (this.f123017r) {
            mo65255r();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52015a(Bundle bundle) {
        super.mo52015a(bundle);
        bundle.putBoolean("hasLaunched", this.f123017r);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65099a(bwny bwny, Bundle bundle) {
        mo65097a(new bjnp(this.f122639a));
        super.mo65099a(bwny, bundle);
        if (bundle != null) {
            this.f123017r = bundle.getBoolean("hasLaunched");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65100a(bwny bwny, bwny bwny2) {
        super.mo65100a(bwny, bwny2);
        bxvj bxvj = bwsf.f160852c;
        bwny2.mo74135a(bxvj);
        Object b = bwny2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f123014m = (bwsf) b;
    }
}

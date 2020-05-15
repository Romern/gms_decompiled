package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.plus.data.internal.PlusImageView;
import com.google.android.gms.plus.internal.PlusSession;
import com.google.android.gms.plus.internal.model.apps.ApplicationEntity;
import com.google.android.gms.plus.model.posts.Comment;
import com.google.android.gms.plus.model.posts.Post;
import com.google.android.gms.plus.model.posts.Settings;
import com.google.android.gms.plus.service.v1whitelisted.models.MomentsFeed;
import com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed;
import com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity;
import java.util.List;

/* renamed from: anwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anwj extends sdb implements anuy {

    /* renamed from: b */
    private final PlusSession f77818b;

    public anwj(Context context, sat sat, PlusSession plusSession, rjz rjz, rka rka) {
        super(context, sat, rjz, rka);
        this.f77818b = plusSession;
    }

    /* renamed from: H */
    public final boolean mo16778H() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusInternalService");
        if (queryLocalInterface instanceof antq) {
            return (antq) queryLocalInterface;
        }
        return new anto(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.plus.service.internal.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.plus.internal.IPlusInternalService";
    }

    /* renamed from: c */
    public final String mo42330c() {
        mo25288A();
        try {
            return ((antq) mo25289B()).mo42252a();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Bundle mo12238f() {
        Bundle a = this.f77818b.mo46579a();
        a.putBoolean("skip_oob", false);
        String[] strArr = this.f77818b.f82354e;
        if (strArr != null) {
            a.putStringArray("required_features", strArr);
        }
        String str = this.f77818b.f82357h;
        if (str != null) {
            a.putString("application_name", str);
        }
        String str2 = this.f77818b.f82356g;
        if (str2 != null) {
            a.putString("com.google.android.gms.plus.internal.CALLING_PACKAGE_NAME", str2);
        }
        a.putString("auth_package", this.f77818b.f82355f);
        return a;
    }

    /* renamed from: b */
    public final void mo42326b(anns anns, String str, int i, String str2) {
        mo25288A();
        anvp anvp = new anvp(this, anns);
        try {
            ((antq) mo25289B()).mo42261a(anvp, str, i, str2, null, null);
        } catch (RemoteException e) {
            anvp.mo42244a(8, (Bundle) null, (MomentsFeed) null);
        }
    }

    /* renamed from: a */
    public final void mo42305a(anmx anmx, String str) {
        mo25288A();
        anvn anvn = new anvn(this, anmx);
        try {
            ((antq) mo25289B()).mo42276e(anvn, str);
        } catch (RemoteException e) {
            anvn.mo42247a(8, (Bundle) null, str);
        }
    }

    /* renamed from: b */
    public final void mo42327b(anup anup, int i, String str) {
        mo25288A();
        anvh anvh = new anvh(this, anup);
        try {
            ((antq) mo25289B()).mo42254a(anvh, 0, i, str);
        } catch (RemoteException e) {
            anvh.mo42250a(DataHolder.m22539b(8), (String) null);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: antq.a(antn, java.lang.String, java.lang.String, boolean, java.lang.String):void
     arg types: [anwf, java.lang.String, java.lang.String, boolean, java.lang.String]
     candidates:
      antq.a(antn, java.lang.String, java.lang.String, int, java.lang.String):void
      antq.a(antn, java.lang.String, java.lang.String, boolean, java.lang.String):void */
    /* renamed from: a */
    public final void mo42306a(annh annh, String str, String str2, boolean z, String str3) {
        mo25288A();
        anwf anwf = new anwf(this, annh);
        try {
            ((antq) mo25289B()).mo42268a((antn) anwf, str, str2, z, str3);
        } catch (RemoteException e) {
            anwf.mo42251b(8, null);
        }
    }

    /* renamed from: b */
    public final void mo42328b(anus anus, String str) {
        mo25288A();
        anvv anvv = new anvv(this, anus);
        try {
            ((antq) mo25289B()).mo42272b(anvv, str);
        } catch (RemoteException e) {
            anvv.mo41924a(8, (Bundle) null, (Bundle) null);
        }
    }

    /* renamed from: a */
    public final void mo42307a(anns anns, String str, int i, String str2) {
        mo25288A();
        anvp anvp = new anvp(this, anns);
        try {
            ((antq) mo25289B()).mo42260a(anvp, str, i, str2);
        } catch (RemoteException e) {
            anvp.mo42244a(8, (Bundle) null, (MomentsFeed) null);
        }
    }

    /* renamed from: a */
    public final void mo42308a(anrp anrp, int i, int i2, String str) {
        mo25288A();
        anvt anvt = new anvt(this, anrp);
        try {
            ((antq) mo25289B()).mo42270b(anvt, i, i2, str);
        } catch (RemoteException e) {
            anvt.mo42245a(8, (Bundle) null, (PeopleFeed) null);
        }
    }

    /* renamed from: a */
    public final void mo42309a(anum anum, String str, Audience audience) {
        mo25288A();
        anvb anvb = new anvb(this, anum);
        try {
            ((antq) mo25289B()).mo42262a(anvb, str, audience);
        } catch (RemoteException e) {
            anvb.mo42237a(8, (Bundle) null);
        }
    }

    /* renamed from: a */
    public final void mo42310a(anun anun, String str, ApplicationEntity applicationEntity) {
        mo25288A();
        anvd anvd = new anvd(this, anun);
        try {
            ((antq) mo25289B()).mo42263a(anvd, str, applicationEntity);
        } catch (RemoteException e) {
            anvd.mo42248a(8, null, str, null);
        }
    }

    /* renamed from: a */
    public final void mo42311a(anuo anuo, String str, ApplicationEntity applicationEntity, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        mo25288A();
        try {
            ((antq) mo25289B()).mo42264a(new anvf(this, anuo), str, applicationEntity, list, z, z2, z3, z4);
        } catch (RemoteException e) {
        }
    }

    /* renamed from: a */
    public final void mo42312a(anup anup, int i, String str) {
        mo25288A();
        anvh anvh = new anvh(this, anup);
        try {
            ((antq) mo25289B()).mo42255a(anvh, i, str);
        } catch (RemoteException e) {
            anvh.mo42250a(DataHolder.m22539b(8), (String) null);
        }
    }

    /* renamed from: a */
    public final void mo42313a(anuq anuq, Comment comment) {
        mo25288A();
        anuz anuz = new anuz(this, anuq);
        try {
            ((antq) mo25289B()).mo42257a(anuz, comment);
        } catch (RemoteException e) {
            anuz.mo42241a(8, (Bundle) null, (Comment) null);
        }
    }

    /* renamed from: a */
    public final void mo42314a(anur anur, String str) {
        mo25288A();
        anvl anvl = new anvl(this, anur);
        try {
            ((antq) mo25289B()).mo42277f(anvl, str);
        } catch (RemoteException e) {
            anvl.mo42249a(8, (Bundle) null, (List) null);
        }
    }

    /* renamed from: a */
    public final void mo42315a(anus anus, String str) {
        mo25288A();
        anvv anvv = new anvv(this, anus);
        try {
            ((antq) mo25289B()).mo42259a(anvv, str);
        } catch (RemoteException e) {
            anvv.mo41924a(8, (Bundle) null, (Bundle) null);
        }
    }

    /* renamed from: a */
    public final void mo42316a(anus anus, String str, String str2) {
        mo25288A();
        anvv anvv = new anvv(this, anus);
        try {
            ((antq) mo25289B()).mo42266a(anvv, str, str2);
        } catch (RemoteException e) {
            anvv.mo41924a(8, (Bundle) null, (Bundle) null);
        }
    }

    /* renamed from: a */
    public final void mo42317a(anut anut, Post post) {
        mo25288A();
        anvx anvx = new anvx(this, anut);
        try {
            ((antq) mo25289B()).mo42273c(anvx, post);
        } catch (RemoteException e) {
            anvx.mo41924a(8, (Bundle) null, (Bundle) null);
        }
    }

    /* renamed from: a */
    public final void mo42318a(anuu anuu, Post post) {
        mo25288A();
        anvz anvz = new anvz(this, anuu);
        try {
            ((antq) mo25289B()).mo42271b(anvz, post);
        } catch (RemoteException e) {
            anvz.mo42243a(8, (Bundle) null, (Settings) null);
        }
    }

    /* renamed from: a */
    public final void mo42319a(anuv anuv, Post post) {
        mo25288A();
        anwb anwb = new anwb(this, anuv);
        try {
            ((antq) mo25289B()).mo42258a(anwb, post);
        } catch (RemoteException e) {
            anwb.mo42242a(8, (Bundle) null, (Post) null);
        }
    }

    /* renamed from: a */
    public final void mo42320a(anuw anuw) {
        mo25288A();
        anwd anwd = new anwd(this, anuw);
        try {
            ((antq) mo25289B()).mo42253a(anwd);
        } catch (RemoteException e) {
            anwd.mo41924a(8, (Bundle) null, (Bundle) null);
        }
    }

    /* renamed from: a */
    public final void mo42321a(anux anux, String str, UpgradeAccountEntity upgradeAccountEntity) {
        mo25288A();
        anwh anwh = new anwh(this, anux);
        try {
            ((antq) mo25289B()).mo42265a(anwh, str, upgradeAccountEntity);
        } catch (RemoteException e) {
            anwh.mo42246a(8, (Bundle) null, (UpgradeAccountEntity) null);
        }
    }

    /* renamed from: a */
    public final void mo42322a(aoae aoae, String str) {
        mo25288A();
        anvj anvj = new anvj(this, aoae);
        try {
            ((antq) mo25289B()).mo42274c(anvj, str);
        } catch (RemoteException e) {
            anvj.mo41924a(8, (Bundle) null, (Bundle) null);
        }
    }

    /* renamed from: a */
    public final void mo42323a(PlusImageView plusImageView, Uri uri, int i) {
        mo25288A();
        Bundle bundle = new Bundle();
        bundle.putInt("bounding_box", i);
        anvr anvr = new anvr(this, plusImageView);
        try {
            ((antq) mo25289B()).mo42256a(anvr, uri, bundle);
        } catch (RemoteException e) {
            anvr.mo42238a(8, (Bundle) null, (ParcelFileDescriptor) null);
        }
    }
}

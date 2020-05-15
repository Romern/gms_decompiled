package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.internal.PlusSession;
import com.google.android.gms.plus.model.posts.Comment;

/* renamed from: aolz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aolz extends Fragment implements anuq {

    /* renamed from: a */
    public static final long f78434a = ((Long) ansx.f77674X.mo25081c()).longValue();

    /* renamed from: j */
    private static final String[] f78435j = {"https://www.googleapis.com/auth/plus.me", "https://www.googleapis.com/auth/plus.stream.write", "https://www.googleapis.com/auth/plus.settings", "https://www.googleapis.com/auth/plus.pages.manage"};

    /* renamed from: b */
    public anuy f78436b;

    /* renamed from: c */
    public aolx f78437c;

    /* renamed from: d */
    public boolean f78438d;

    /* renamed from: e */
    public rkb f78439e;

    /* renamed from: f */
    public String f78440f;

    /* renamed from: g */
    public boolean f78441g;

    /* renamed from: h */
    public Comment f78442h;

    /* renamed from: i */
    public aoly f78443i;

    /* renamed from: k */
    private anul f78444k = anuy.f77749a;

    /* renamed from: l */
    private aolw f78445l;

    /* renamed from: m */
    private String f78446m;

    /* renamed from: a */
    public static aolz m66011a(String str) {
        anul anul = anuy.f77749a;
        Bundle bundle = new Bundle();
        bundle.putString("specified_account_name", str);
        aolz aolz = new aolz();
        aolz.f78444k = anul;
        aolz.setArguments(bundle);
        return aolz;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Activity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            this.f78446m = this.f78443i.getCallingPackage();
            String a = aomi.m66049a(activity, getArguments().getString("specified_account_name"), this.f78446m, soz.m35792a(soz.m35801d(activity, this.f78443i.getCallingPackage())));
            anwk anwk = new anwk(activity);
            anwk.f77821c = this.f78446m;
            anwk.f77819a = a;
            anwk.f77823e = this.f78443i.mo42973d().f78541m;
            anwk.mo42334a(f78435j);
            int i = 0;
            if (aomi.m66054a(activity, this.f78443i.mo42973d().f78534f)) {
                anwk.f77822d = new String[0];
            }
            if (this.f78436b == null) {
                this.f78437c = new aolx(this);
                anul anul = this.f78444k;
                Context applicationContext = activity.getApplicationContext();
                PlusSession a2 = anwk.mo42333a();
                aolx aolx = this.f78437c;
                anuy a3 = anul.mo42292a(applicationContext, a2, aolx, aolx);
                this.f78436b = a3;
                a3.mo42332x();
            }
            if (this.f78439e == null) {
                if (this.f78443i.mo42973d().mo43052d()) {
                    try {
                        i = Integer.parseInt(this.f78443i.mo42973d().f78541m);
                    } catch (NumberFormatException e) {
                    }
                }
                this.f78445l = new aolw(this);
                rkb a4 = this.f78444k.mo42293a(activity, i, this.f78446m);
                this.f78439e = a4;
                a4.mo24790a((rjz) this.f78445l);
                this.f78439e.mo24791a((rka) this.f78445l);
            }
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof aoly)) {
            String valueOf = String.valueOf(aoly.class.getSimpleName());
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Host must implement ") : "Host must implement ".concat(valueOf));
        } else {
            this.f78443i = (aoly) activity;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.f78436b.mo24648p() || this.f78436b.mo24649q()) {
            this.f78436b.mo14032j();
        }
        this.f78436b = null;
        if (this.f78439e.mo24805i() || this.f78439e.mo24806j()) {
            this.f78439e.mo24803g();
        }
        this.f78439e = null;
        this.f78440f = null;
    }

    public final void onDetach() {
        super.onDetach();
        this.f78443i = null;
    }

    /* renamed from: a */
    public final void mo42297a(ConnectionResult connectionResult) {
        aoly aoly;
        if (this.f78441g && (aoly = this.f78443i) != null) {
            aoly.mo42987b(connectionResult);
        }
        this.f78441g = false;
    }

    /* renamed from: a */
    public final void mo42989a(FavaDiagnosticsEntity favaDiagnosticsEntity) {
        String str;
        Activity activity = getActivity();
        if (activity != null && (str = this.f78440f) != null && this.f78446m != null) {
            shz.m35339a(activity, str, this.f78443i.mo42973d().mo43050b(), favaDiagnosticsEntity, riw.f43134b, this.f78446m);
        }
    }
}

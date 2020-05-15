package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.circles.AddToCircleConsentData;
import com.google.android.gms.plus.internal.PlusSession;
import com.google.android.gms.plus.model.posts.Post;
import com.google.android.gms.plus.model.posts.Settings;
import com.google.android.gms.plus.service.v1whitelisted.models.ActionTargetEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientActionDataEntity;
import java.util.ArrayList;

/* renamed from: aomu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aomu extends Fragment implements anuv, anuu, anut {

    /* renamed from: E */
    private static final String[] f78496E = {"https://www.googleapis.com/auth/plus.me", "https://www.googleapis.com/auth/plus.stream.write", "https://www.googleapis.com/auth/plus.settings", "https://www.googleapis.com/auth/plus.pages.manage"};

    /* renamed from: a */
    public static final Status f78497a = new Status(8);

    /* renamed from: A */
    public final rkl f78498A = new aomk(this);

    /* renamed from: B */
    public final rkl f78499B = new aoml(this);

    /* renamed from: C */
    public final rkl f78500C = new aomm(this);

    /* renamed from: D */
    public final rkl f78501D = new aomn(this);

    /* renamed from: F */
    private anul f78502F = anuy.f77749a;

    /* renamed from: G */
    private final rkl f78503G = new aomo(this);

    /* renamed from: b */
    public anuy f78504b;

    /* renamed from: c */
    public aoms f78505c;

    /* renamed from: d */
    public rkb f78506d;

    /* renamed from: e */
    public aomr f78507e;

    /* renamed from: f */
    public aomt f78508f;

    /* renamed from: g */
    public aomv f78509g;

    /* renamed from: h */
    public String f78510h;

    /* renamed from: i */
    public String[] f78511i;

    /* renamed from: j */
    public String f78512j;

    /* renamed from: k */
    public int f78513k;

    /* renamed from: l */
    public boolean f78514l;

    /* renamed from: m */
    public Post f78515m;

    /* renamed from: n */
    public Settings f78516n;

    /* renamed from: o */
    public AddToCircleConsentData f78517o;

    /* renamed from: p */
    public ansz f78518p;

    /* renamed from: q */
    public String f78519q;

    /* renamed from: r */
    public Bitmap f78520r;

    /* renamed from: s */
    public boolean f78521s;

    /* renamed from: t */
    public String f78522t;

    /* renamed from: u */
    public boolean f78523u;

    /* renamed from: v */
    public String f78524v;

    /* renamed from: w */
    public Audience f78525w;

    /* renamed from: x */
    public final ArrayList f78526x = new ArrayList();

    /* renamed from: y */
    public long f78527y = ((Long) ansx.f77674X.mo25081c()).longValue();

    /* renamed from: z */
    public final rkl f78528z = new aomj(this);

    /* renamed from: a */
    public static aomu m66086a(String str) {
        anul anul = anuy.f77749a;
        Bundle bundle = new Bundle();
        bundle.putString("specified_account_name", str);
        aomu aomu = new aomu();
        aomu.f78502F = anul;
        aomu.setArguments(bundle);
        return aomu;
    }

    /* renamed from: b */
    public final void mo43046b() {
        Audience audience = this.f78525w;
        ArrayList arrayList = new ArrayList();
        if (audience != null && !sfi.m35164a(audience)) {
            int size = audience.f30287b.size();
            for (int i = 0; i < size; i++) {
                AudienceMember audienceMember = (AudienceMember) audience.f30287b.get(i);
                if (audienceMember.f30292b == 2) {
                    arrayList.add(audienceMember.f30295e);
                }
            }
        }
        if (arrayList.isEmpty()) {
            if (Log.isLoggable("ShareBox", 5)) {
                Log.w("ShareBox", "No people to add to circle");
            }
            mo43041a(f78497a, null, null);
        } else if (this.f78506d.mo24805i()) {
            rjo rjo = allr.f73629a;
            rkb rkb = this.f78506d;
            rkb.mo24795b(new amcj(rkb, this.f78512j, this.f78509g.mo43050b(), this.f78524v, arrayList)).mo9458a(this.f78503G);
        } else if (!this.f78506d.mo24806j()) {
            this.f78506d.mo24801e();
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        int i;
        super.onActivityCreated(bundle);
        Activity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            this.f78509g = this.f78508f.mo43003j();
            String callingPackage = this.f78508f.getCallingPackage();
            this.f78510h = callingPackage;
            this.f78511i = soz.m35792a(soz.m35801d(activity, callingPackage));
            String a = aomi.m66049a(activity, getArguments().getString("specified_account_name"), this.f78510h, this.f78511i);
            anwk anwk = new anwk(activity);
            anwk.f77821c = this.f78510h;
            anwk.f77824f = this.f78508f.mo43002i();
            anwk.f77819a = a;
            anwk.f77823e = this.f78509g.f78541m;
            anwk.mo42334a(f78496E);
            if (aomi.m66054a(activity, this.f78509g.f78534f)) {
                anwk.f77822d = new String[0];
            }
            if (this.f78504b == null) {
                this.f78505c = new aoms(this);
                anul anul = this.f78502F;
                Context applicationContext = activity.getApplicationContext();
                PlusSession a2 = anwk.mo42333a();
                aoms aoms = this.f78505c;
                anuy a3 = anul.mo42292a(applicationContext, a2, aoms, aoms);
                this.f78504b = a3;
                a3.mo42332x();
            }
            if (this.f78506d == null) {
                if (!rfz.m33557a(getActivity()).mo24610b(this.f78510h)) {
                    i = 100;
                } else {
                    i = 80;
                }
                String str = this.f78509g.f78541m;
                if (str != null) {
                    try {
                        i = Integer.parseInt(str);
                    } catch (NumberFormatException e) {
                    }
                }
                this.f78507e = new aomr(this);
                rkb a4 = this.f78502F.mo42293a(activity, i, this.f78510h);
                this.f78506d = a4;
                a4.mo24790a((rjz) this.f78507e);
                this.f78506d.mo24791a((rka) this.f78507e);
            }
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof aomt)) {
            String valueOf = String.valueOf(aomt.class.getSimpleName());
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Host must implement ") : "Host must implement ".concat(valueOf));
        } else {
            this.f78508f = (aomt) activity;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.f78504b.mo24648p() || this.f78504b.mo24649q()) {
            this.f78504b.mo14032j();
        }
        this.f78504b = null;
        if (this.f78506d.mo24805i() || this.f78506d.mo24806j()) {
            this.f78506d.mo24803g();
        }
        this.f78506d = null;
        this.f78512j = null;
        this.f78513k = -1;
    }

    public final void onDetach() {
        super.onDetach();
        this.f78508f = null;
    }

    /* renamed from: a */
    public final void mo42300a(ConnectionResult connectionResult, ansz ansz) {
        this.f78518p = ansz;
        aomt aomt = this.f78508f;
        if (aomt != null) {
            aomt.mo43032a(connectionResult, ansz);
        }
    }

    /* renamed from: a */
    public final void mo42302a(ConnectionResult connectionResult, Post post) {
        aomt aomt;
        if (this.f78514l && (aomt = this.f78508f) != null) {
            aomt.mo43033a(connectionResult, post);
        }
        this.f78514l = false;
    }

    /* renamed from: a */
    public final void mo42301a(ConnectionResult connectionResult, Settings settings) {
        this.f78516n = settings;
        aomt aomt = this.f78508f;
        if (aomt != null) {
            aomt.mo43034a(connectionResult, settings);
        }
    }

    /* renamed from: a */
    public final void mo43040a(Status status, AddToCircleConsentData addToCircleConsentData) {
        this.f78517o = addToCircleConsentData;
        aomt aomt = this.f78508f;
        if (aomt != null) {
            aomt.mo43035a(status);
        }
    }

    /* renamed from: a */
    public final void mo43041a(Status status, String str, String[] strArr) {
        this.f78524v = null;
        this.f78525w = null;
        aomt aomt = this.f78508f;
        if (aomt != null) {
            aomt.mo43038a(status, str, strArr);
        }
    }

    /* renamed from: a */
    public final void mo43042a(FavaDiagnosticsEntity favaDiagnosticsEntity) {
        mo43047b(favaDiagnosticsEntity, riw.f43135c);
    }

    /* renamed from: a */
    public final void mo43043a(FavaDiagnosticsEntity favaDiagnosticsEntity, FavaDiagnosticsEntity favaDiagnosticsEntity2) {
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        if (mo43045a()) {
            shz.m35338a(activity, this.f78512j, favaDiagnosticsEntity, favaDiagnosticsEntity2, this.f78510h);
            return;
        }
        ArrayList arrayList = this.f78526x;
        aomp aomp = new aomp();
        aomp.f78484a = favaDiagnosticsEntity;
        aomp.f78485b = favaDiagnosticsEntity2;
        arrayList.add(aomp.mo43026a());
    }

    /* renamed from: b */
    public final void mo43047b(FavaDiagnosticsEntity favaDiagnosticsEntity, FavaDiagnosticsEntity favaDiagnosticsEntity2) {
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        if (mo43045a()) {
            shz.m35339a(activity, this.f78512j, this.f78508f.mo43003j().mo43050b(), favaDiagnosticsEntity, favaDiagnosticsEntity2, this.f78510h);
            return;
        }
        ArrayList arrayList = this.f78526x;
        aomp aomp = new aomp();
        aomp.f78486c = favaDiagnosticsEntity;
        aomp.f78484a = favaDiagnosticsEntity2;
        arrayList.add(aomp.mo43026a());
    }

    /* renamed from: a */
    public final void mo43044a(FavaDiagnosticsEntity favaDiagnosticsEntity, FavaDiagnosticsEntity favaDiagnosticsEntity2, ClientActionDataEntity clientActionDataEntity, ActionTargetEntity actionTargetEntity) {
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        if (mo43045a()) {
            shy shy = new shy(activity);
            shy.mo25576a(this.f78512j);
            shy.mo25573a(favaDiagnosticsEntity);
            if (favaDiagnosticsEntity2 == null) {
                favaDiagnosticsEntity2 = riw.f43135c;
            }
            shy.mo25581c(favaDiagnosticsEntity2);
            shy.mo25579b(this.f78510h);
            if (clientActionDataEntity != null) {
                shy.mo25575a(clientActionDataEntity);
            }
            if (actionTargetEntity != null) {
                shy.mo25574a(actionTargetEntity);
            }
            shz.m35341a(activity, shy);
            return;
        }
        ArrayList arrayList = this.f78526x;
        aomp aomp = new aomp();
        aomp.f78484a = favaDiagnosticsEntity2;
        aomp.f78486c = favaDiagnosticsEntity;
        aomp.f78487d = clientActionDataEntity;
        aomp.f78488e = actionTargetEntity;
        arrayList.add(aomp.mo43026a());
    }

    /* renamed from: a */
    public final boolean mo43045a() {
        return !TextUtils.isEmpty(this.f78512j);
    }
}

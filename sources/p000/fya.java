package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Process;
import com.google.android.chimera.AsyncTaskLoader;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.p015ui.context.section.LoaderSectionInfo;
import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fya extends AsyncTaskLoader {

    /* renamed from: a */
    private final Context f17578a;

    /* renamed from: b */
    private final List f17579b;

    /* renamed from: c */
    private final String f17580c;

    /* renamed from: d */
    private final String f17581d;

    /* renamed from: e */
    private final fxa f17582e;

    /* renamed from: f */
    private ArrayList f17583f;

    /* renamed from: g */
    private final fva f17584g;

    /* renamed from: h */
    private final fxy f17585h;

    public fya(Context context, String str, String str2, LoaderSectionInfo loaderSectionInfo, fva fva, fxa fxa) {
        super(context);
        this.f17580c = str;
        this.f17579b = loaderSectionInfo.f9799l;
        this.f17578a = context;
        this.f17581d = str2;
        this.f17582e = fxa;
        this.f17584g = fva;
        this.f17585h = new fxy(loaderSectionInfo.f9789b, loaderSectionInfo.f9790c, false);
    }

    /* renamed from: a */
    public final void deliverResult(ArrayList arrayList) {
        fxa fxa = this.f17582e;
        if (fxa != null) {
            fxa.mo7256g();
        }
        this.f17583f = arrayList;
        if (isStarted()) {
            super.deliverResult(arrayList);
        }
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        Account account = new Account(this.f17580c, "com.google");
        ClientContext clientContext = new ClientContext();
        clientContext.f30212b = Process.myUid();
        clientContext.f30214d = account;
        clientContext.f30213c = account;
        clientContext.f30215e = this.f17581d;
        clientContext.f30216f = this.f17578a.getPackageName();
        clientContext.mo17799a(new String[]{"https://www.googleapis.com/auth/plus.native"});
        ArrayList a = this.f17584g.mo11386a(clientContext);
        if (a == null || a.size() == 0) {
            List list = this.f17579b;
            if (list != null) {
                return new ArrayList(list);
            }
            return new ArrayList();
        }
        fzl fzl = new fzl();
        List list2 = this.f17579b;
        if (list2 != null) {
            fzl.mo11563a(list2);
        }
        for (int i = 0; i < a.size(); i++) {
            this.f17585h.mo11502a(((ContactPerson) a.get(i)).f9753e);
            if (((ContactPerson) a.get(i)).f9753e.size() > 0) {
                fzl.mo11561a((ContactPerson) a.get(i));
            }
        }
        return fzl.f17738a;
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        super.onReset();
        onStopLoading();
        this.f17583f = null;
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        super.onStartLoading();
        ArrayList arrayList = this.f17583f;
        if (arrayList != null) {
            deliverResult(arrayList);
        }
        if (takeContentChanged() || this.f17583f == null) {
            forceLoad();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStopLoading() {
        cancelLoad();
        super.onStopLoading();
    }
}

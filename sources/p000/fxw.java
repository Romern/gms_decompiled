package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.chimera.AsyncTaskLoader;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.p015ui.context.section.LoaderSectionInfo;
import java.util.ArrayList;

/* renamed from: fxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fxw extends AsyncTaskLoader {

    /* renamed from: a */
    private final String f17562a;

    /* renamed from: b */
    private final String f17563b;

    /* renamed from: c */
    private ArrayList f17564c;

    /* renamed from: d */
    private final rkb f17565d;

    public fxw(Context context, String str, LoaderSectionInfo loaderSectionInfo) {
        super(context);
        this.f17562a = str;
        this.f17563b = loaderSectionInfo.f9791d;
        allp a = allq.m61232a();
        a.f73626a = 80;
        allq a2 = a.mo40491a();
        rjy rjy = new rjy(context.getApplicationContext());
        rjy.mo24778a(this.f17562a);
        rjy.mo24780a(allr.f73629a, a2);
        this.f17565d = rjy.mo24784b();
    }

    /* renamed from: a */
    public final void deliverResult(ArrayList arrayList) {
        this.f17564c = arrayList;
        if (isStarted()) {
            super.deliverResult(this.f17564c);
        }
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        if (TextUtils.isEmpty(this.f17563b) || !this.f17565d.mo24802f().mo17671b()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String[] split = this.f17563b.split(":");
        for (int i = 0; i < split.length; i++) {
            try {
                int parseInt = Integer.parseInt(split[i]);
                rjo rjo = allr.f73629a;
                rkb rkb = this.f17565d;
                String str = this.f17562a;
                alkv alkv = new alkv();
                alkv.f73609a = parseInt;
                alkw alkw = (alkw) amcf.m62588a(rkb, str, (String) null, alkv).mo9455a();
                if (alkw.mo7183bo() != null && alkw.mo7183bo().mo17710c()) {
                    amev b = alkw.mo40471b();
                    for (int i2 = 0; i2 < b.mo24660a(); i2++) {
                        alzj b2 = b.mo24661a(i2);
                        String d = b2.mo41057d();
                        String c = b2.mo41056c();
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(new ContactPerson.ContactMethod(3, c));
                        arrayList.add(new ContactPerson(d, null, null, arrayList2));
                    }
                    b.mo12460c();
                }
                alkw.mo12460c();
            } catch (NumberFormatException e) {
            }
        }
        this.f17565d.mo24803g();
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        super.onReset();
        onStopLoading();
        this.f17564c = null;
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        ArrayList arrayList = this.f17564c;
        if (arrayList != null) {
            deliverResult(arrayList);
        }
        if (takeContentChanged() || this.f17564c == null) {
            forceLoad();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStopLoading() {
        cancelLoad();
        this.f17565d.mo24803g();
    }
}

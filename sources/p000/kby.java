package p000;

import android.content.IntentSender;
import android.os.Build;
import android.service.autofill.Dataset;
import android.service.autofill.InlinePresentation;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.widget.RemoteViews;
import java.util.regex.Pattern;

/* renamed from: kby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kby {

    /* renamed from: a */
    private final Dataset.Builder f23727a;

    /* renamed from: b */
    private RemoteViews f23728b;

    /* renamed from: c */
    private String f23729c;

    /* renamed from: d */
    private IntentSender f23730d;

    /* renamed from: e */
    private boolean f23731e;

    public kby() {
        this.f23729c = "";
        this.f23731e = false;
        this.f23727a = new Dataset.Builder();
    }

    /* renamed from: a */
    public final kbz mo14352a() {
        if (!this.f23731e) {
            return null;
        }
        Dataset build = this.f23727a.build();
        String str = this.f23729c;
        bmxv.m108567c(this.f23730d);
        bmxv.m108567c(this.f23728b);
        return new kbz(build, str);
    }

    public kby(RemoteViews remoteViews) {
        this.f23729c = "";
        this.f23731e = false;
        this.f23728b = remoteViews;
        this.f23727a = new Dataset.Builder(remoteViews);
    }

    /* renamed from: a */
    public final void mo14353a(IntentSender intentSender) {
        this.f23727a.setAuthentication(intentSender);
        this.f23730d = intentSender;
    }

    /* renamed from: a */
    public final void mo14354a(AutofillId autofillId, AutofillValue autofillValue) {
        this.f23727a.setValue(autofillId, autofillValue);
        int i = Build.VERSION.SDK_INT;
        this.f23731e = true;
    }

    /* renamed from: a */
    public final void mo14355a(AutofillId autofillId, AutofillValue autofillValue, RemoteViews remoteViews, bmxv bmxv) {
        if (bmxv.mo66813a()) {
            this.f23727a.setValue(autofillId, autofillValue, remoteViews, (InlinePresentation) bmxv.mo66814b());
        } else {
            this.f23727a.setValue(autofillId, autofillValue, remoteViews);
        }
        this.f23731e = true;
    }

    /* renamed from: a */
    public final void mo14356a(AutofillId autofillId, AutofillValue autofillValue, Pattern pattern, RemoteViews remoteViews, bmxv bmxv) {
        if (bmxv.mo66813a()) {
            this.f23727a.setValue(autofillId, autofillValue, pattern, remoteViews, (InlinePresentation) bmxv.mo66814b());
        } else {
            this.f23727a.setValue(autofillId, autofillValue, pattern, remoteViews);
        }
        this.f23731e = true;
    }

    /* renamed from: a */
    public final void mo14357a(String str) {
        this.f23727a.setId(str);
        this.f23729c = str;
    }
}

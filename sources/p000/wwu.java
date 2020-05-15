package p000;

import android.app.ApplicationErrorReport;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wwu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class wwu {

    /* renamed from: a */
    public String f51496a;

    /* renamed from: b */
    public final Bundle f51497b;

    /* renamed from: c */
    public String f51498c;

    /* renamed from: d */
    public String f51499d;

    /* renamed from: e */
    public final List f51500e;

    /* renamed from: f */
    public ThemeSettings f51501f;

    /* renamed from: g */
    public LogOptions f51502g;

    /* renamed from: h */
    public long f51503h;

    /* renamed from: i */
    public ApplicationErrorReport f51504i;

    /* renamed from: j */
    private Bitmap f51505j;

    /* renamed from: k */
    private BitmapTeleporter f51506k;

    /* renamed from: l */
    private boolean f51507l;

    /* renamed from: m */
    private boolean f51508m;

    /* renamed from: n */
    private wvd f51509n;

    /* renamed from: o */
    private String f51510o;

    /* renamed from: p */
    private final boolean f51511p;

    @Deprecated
    public wwu() {
        this.f51497b = new Bundle();
        this.f51500e = new ArrayList();
        this.f51510o = wzg.m42516a();
        this.f51511p = false;
        this.f51503h = 0;
    }

    /* renamed from: a */
    public FeedbackOptions mo29490a() {
        FeedbackOptions feedbackOptions = new FeedbackOptions(new ApplicationErrorReport());
        feedbackOptions.f31602m = this.f51505j;
        feedbackOptions.f31595f = this.f51506k;
        feedbackOptions.f31590a = this.f51496a;
        feedbackOptions.f31592c = this.f51498c;
        feedbackOptions.f31591b = this.f51497b;
        feedbackOptions.f31594e = this.f51499d;
        feedbackOptions.f31597h = this.f51500e;
        feedbackOptions.f31598i = this.f51507l;
        feedbackOptions.f31599j = this.f51501f;
        feedbackOptions.f31600k = this.f51502g;
        feedbackOptions.f31601l = this.f51508m;
        feedbackOptions.f31606q = this.f51509n;
        feedbackOptions.f31603n = this.f51510o;
        feedbackOptions.f31604o = this.f51511p;
        feedbackOptions.f31605p = this.f51503h;
        return feedbackOptions;
    }

    /* renamed from: b */
    public final void mo29496b() {
        this.f51507l = true;
    }

    public wwu(Context context) {
        aymt.m84282a(context);
        this.f51497b = new Bundle();
        this.f51500e = new ArrayList();
        try {
            this.f51510o = !((Boolean) wzi.f51597c.mo54082a()).booleanValue() ? wzg.m42516a() : wzg.m42522b();
        } catch (SecurityException e) {
            this.f51510o = wzg.m42516a();
        }
        this.f51511p = false;
        this.f51503h = 0;
    }

    /* renamed from: b */
    public final void mo29497b(Bitmap bitmap) {
        if (!this.f51507l || !cdug.f181769a.mo6606a().mo78345c()) {
            this.f51505j = bitmap;
            return;
        }
        throw new IllegalStateException("Can't call setScreenshotBitmap after report is already certified pii free.");
    }

    @Deprecated
    /* renamed from: a */
    public final void mo29491a(Bitmap bitmap) {
        if (bitmap != null) {
            mo29497b(bitmap);
        }
    }

    @Deprecated
    /* renamed from: a */
    public final void mo29492a(String str, String str2) {
        if (!this.f51508m) {
            this.f51497b.putString(str, str2);
            return;
        }
        throw new IllegalStateException("Can't call addPsd after psd is already certified pii free");
    }

    /* renamed from: a */
    public final void mo29493a(String str, String str2, boolean z) {
        mo29495a(z);
        this.f51497b.putString(str, str2);
    }

    public wwu(FeedbackOptions feedbackOptions) {
        this.f51505j = feedbackOptions.f31602m;
        this.f51506k = feedbackOptions.f31595f;
        this.f51496a = feedbackOptions.f31590a;
        this.f51498c = feedbackOptions.f31592c;
        this.f51497b = feedbackOptions.f31591b;
        this.f51499d = feedbackOptions.f31594e;
        this.f51500e = feedbackOptions.f31597h;
        this.f51507l = feedbackOptions.f31598i;
        this.f51501f = feedbackOptions.f31599j;
        this.f51502g = feedbackOptions.f31600k;
        this.f51508m = feedbackOptions.f31601l;
        this.f51509n = feedbackOptions.f31606q;
        this.f51510o = feedbackOptions.f31603n;
        this.f51511p = feedbackOptions.f31604o;
        this.f51503h = feedbackOptions.f31605p;
        this.f51504i = feedbackOptions.f31593d;
    }

    /* renamed from: a */
    public final void mo29494a(wvd wvd, boolean z) {
        mo29495a(z);
        this.f51509n = wvd;
    }

    /* renamed from: a */
    public final void mo29495a(boolean z) {
        if ((!this.f51497b.isEmpty() || !this.f51500e.isEmpty()) && this.f51508m != z) {
            throw new IllegalStateException("Can't mix pii-full psd and pii-free psd");
        }
        this.f51508m = z;
    }
}

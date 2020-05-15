package p000;

import android.content.Context;
import android.os.Build;
import com.google.android.chimera.AsyncTaskLoader;
import java.util.Collection;
import java.util.Comparator;

/* renamed from: fpa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fpa extends AsyncTaskLoader {

    /* renamed from: a */
    private final long f17054a;

    /* renamed from: b */
    private final long f17055b;

    /* renamed from: c */
    private final Comparator f17056c;

    /* renamed from: d */
    private bngx f17057d;

    public fpa(Context context, long j, long j2, Comparator comparator) {
        super(context);
        this.f17054a = j;
        this.f17055b = j2;
        this.f17056c = comparator;
    }

    /* renamed from: a */
    public final void deliverResult(bngx bngx) {
        if (!isReset()) {
            this.f17057d = bngx;
            if (isStarted()) {
                super.deliverResult(bngx);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        bngx bngx = this.f17057d;
        if (bngx != null) {
            deliverResult(bngx);
        }
        if (takeContentChanged() || bngx == null) {
            forceLoad();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStopLoading() {
        cancelLoad();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bngx.a(java.util.Comparator, java.lang.Iterable):bngx
     arg types: [java.util.Comparator, java.util.Collection]
     candidates:
      bngx.a(java.lang.Object, java.lang.Object):bngx
      bngx.a(java.lang.Object[], int):int
      bngx.a(int, int):bngx
      bngm.a(java.lang.Object[], int):int
      bngx.a(java.util.Comparator, java.lang.Iterable):bngx */
    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        Collection collection;
        int i = Build.VERSION.SDK_INT;
        if (((Boolean) skj.f44624g.mo58455c()).booleanValue()) {
            collection = smg.m35655c(getContext().getContentResolver(), this.f17054a, this.f17055b);
        } else {
            collection = smg.m35654b(getContext().getContentResolver(), this.f17054a, this.f17055b);
        }
        return bngx.m109369a(this.f17056c, (Iterable) collection);
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        cancelLoad();
        this.f17057d = null;
    }
}

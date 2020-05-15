package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

/* renamed from: adlj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adlj extends sji {

    /* renamed from: a */
    private final adli f62111a;

    /* renamed from: d */
    private final rnt f62112d;

    /* renamed from: e */
    private final PackageInfo f62113e;

    public adlj(adli adli, rnt rnt, PackageInfo packageInfo) {
        super(121, "DeleteAppStorageOperation");
        this.f62111a = adli;
        this.f62112d = rnt;
        this.f62113e = packageInfo;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11356a(Context context) {
        try {
            this.f62111a.mo33633a(this.f62113e.packageName);
            this.f62112d.mo11797a(Status.f30107a);
        } catch (IOException e) {
            adlm.f62121a.mo33427b(e, "Delete failed.", new Object[0]);
            this.f62112d.mo11797a(Status.f30109c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11357a(Status status) {
        this.f62112d.mo11797a(status);
    }
}

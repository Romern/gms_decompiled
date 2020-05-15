package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.common.people.data.AudienceMember;
import java.lang.ref.WeakReference;

/* renamed from: aevs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aevs extends aevz {

    /* renamed from: a */
    public final Activity f63917a;

    /* renamed from: b */
    public WeakReference f63918b;

    /* renamed from: c */
    public Bitmap f63919c;

    /* renamed from: e */
    private final int f63920e;

    /* renamed from: f */
    private final LoaderManager.LoaderCallbacks f63921f = new aevr(this);

    public aevs(AudienceMember audienceMember, aevy aevy, Activity activity, int i) {
        super(audienceMember, aevy);
        this.f63917a = activity;
        this.f63920e = i;
        if (activity != null) {
            activity.getSupportLoaderManager().initLoader(this.f63920e, null, this.f63921f);
        }
    }

    /* renamed from: a */
    public final void mo34615a(Context context, TextView textView, ImageView imageView) {
        textView.setText(((AudienceMember) this.f63929d).f30296f);
        Bitmap bitmap = this.f63919c;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
            return;
        }
        this.f63918b = new WeakReference(imageView);
        imageView.setImageBitmap(aeti.m52533a(context));
    }
}

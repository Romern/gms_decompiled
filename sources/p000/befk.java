package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: befk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class befk {

    /* renamed from: a */
    public befa f111501a;

    /* renamed from: b */
    public Uri f111502b;

    /* renamed from: c */
    public final Set f111503c;

    public befk() {
        HashSet hashSet = new HashSet();
        this.f111503c = hashSet;
        hashSet.add(befd.f111477a);
    }

    /* renamed from: a */
    public final befl mo60666a() {
        boolean z;
        boolean z2 = true;
        if (this.f111501a != null) {
            z = true;
        } else {
            z = false;
        }
        behg.m95045b(z, "Storage must be set", new Object[0]);
        if (this.f111502b == null) {
            z2 = false;
        }
        behg.m95045b(z2, "BaseUri must be set", new Object[0]);
        return new befl(this);
    }

    /* renamed from: a */
    public final void mo60667a(Uri uri) {
        boolean z;
        try {
            befj.m94965a(uri);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() >= 2) {
                z = true;
            } else {
                z = false;
            }
            behg.m95044a(z, "URI must specify a module", new Object[0]);
            behg.m95044a(pathSegments.get(0).equals("managed"), "URI must be in 'managed' location", new Object[0]);
            this.f111502b = uri.buildUpon().path(TextUtils.join(File.separator, pathSegments.subList(0, 2))).build();
        } catch (begt e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public final void mo60668a(Collection collection) {
        this.f111503c.addAll(collection);
    }
}

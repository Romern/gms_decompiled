package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.LruCache;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: azcj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azcj {

    /* renamed from: d */
    private static WeakReference f98975d = new WeakReference(null);

    /* renamed from: a */
    public final LruCache f98976a = new azce(((int) cfeo.f183719a.mo6606a().mo81084m()) * 1024);

    /* renamed from: b */
    public final Context f98977b;

    /* renamed from: c */
    public final Set f98978c = new HashSet();

    private azcj(Context context) {
        this.f98977b = context;
    }

    /* renamed from: a */
    public static synchronized azcj m85279a(Context context) {
        azcj azcj;
        synchronized (azcj.class) {
            azcj = (azcj) f98975d.get();
            if (azcj == null) {
                azcj = new azcj(context.getApplicationContext());
                f98975d = new WeakReference(azcj);
            }
        }
        return azcj;
    }

    /* renamed from: b */
    public final synchronized void mo54630b(azci azci) {
        this.f98978c.remove(azci);
    }

    /* renamed from: a */
    public final Bitmap mo54625a(LocalEntityId localEntityId) {
        azcf azcf = (azcf) this.f98976a.get(localEntityId);
        if (azcf != null) {
            return azcf.f98968a;
        }
        azcf azcf2 = new azcf(this, localEntityId, new adzt(this.f98977b.getMainLooper()));
        this.f98976a.put(localEntityId, azcf2);
        if (azcf2.f98969b.getState() != Thread.State.NEW) {
            azoj.m85932b("AvatarManager", "Avatar loading task is not ready.", new Object[0]);
            return null;
        }
        azcf2.f98969b.start();
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: azal.a(android.content.Context, java.util.List, boolean):android.graphics.Bitmap
     arg types: [android.content.Context, java.util.List, int]
     candidates:
      azal.a(android.content.Context, com.google.android.libraries.matchstick.data.LocalEntityId, boolean):android.graphics.Bitmap
      azal.a(android.content.Context, java.util.List, boolean):android.graphics.Bitmap */
    /* renamed from: a */
    public final Bitmap mo54626a(List list, aznz aznz) {
        Bitmap bitmap;
        LocalEntityId localEntityId;
        cbgn cbgn;
        cbhy cbhy;
        ByteString bxtx;
        ByteString bxtx2;
        Bitmap bitmap2 = null;
        if (aznz.mo55105c()) {
            localEntityId = (LocalEntityId) list.get(0);
            bitmap = azny.m85882a(this.f98977b, localEntityId);
        } else {
            localEntityId = aznz.f99781h;
            bitmap = null;
        }
        if (bitmap != null) {
            return azal.m85136a(this.f98977b, bitmap);
        }
        boolean b = aznz.mo55104b();
        azdi b2 = azdj.m85399a(this.f98977b).mo54722b(localEntityId);
        if (!(b2 == null || (cbgn = b2.f99083i) == null || (cbhy = cbgn.f177055d) == null)) {
            if (cbhy.f177216a == 1) {
                bxtx = (ByteString) cbhy.f177217b;
            } else {
                bxtx = bxtx.f164797b;
            }
            if (!azpi.m86080b(bxtx.getKey())) {
                cbhy cbhy2 = b2.f99083i.f177055d;
                if (cbhy2 == null) {
                    cbhy2 = cbhy.f177214d;
                }
                if (cbhy2.f177216a == 1) {
                    bxtx2 = (ByteString) cbhy2.f177217b;
                } else {
                    bxtx2 = bxtx.f164797b;
                }
                byte[] k = bxtx2.getKey();
                bitmap2 = azal.m85136a(this.f98977b, BitmapFactory.decodeByteArray(k, 0, k.length));
            }
        }
        if (bitmap2 != null) {
            return bitmap2;
        }
        if (!b) {
            return azal.m85136a(this.f98977b, azny.m85881a(this.f98977b));
        }
        return azal.m85139a(this.f98977b, list, false);
    }

    /* renamed from: a */
    public final synchronized void mo54627a() {
        if (!this.f98978c.isEmpty()) {
            for (azci azci : this.f98978c) {
                azci.mo54624a();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo54628a(azci azci) {
        this.f98978c.add(azci);
    }

    /* renamed from: a */
    public final void mo54629a(LocalEntityId localEntityId, Bitmap bitmap, boolean z, boolean z2) {
        azox.m85981a();
        azcf azcf = (azcf) this.f98976a.get(localEntityId);
        if (azcf == null) {
            if (this.f98976a.size() != 0) {
                azcf = new azcf(this, localEntityId, new adzt(this.f98977b.getMainLooper()));
            } else {
                return;
            }
        }
        this.f98976a.remove(localEntityId);
        if (z2) {
            bitmap = azal.m85136a(this.f98977b, bitmap);
        }
        azcf.f98968a = bitmap;
        this.f98976a.put(localEntityId, azcf);
        if (z) {
            mo54627a();
        }
    }
}

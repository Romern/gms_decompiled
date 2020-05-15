package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: ampm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ampm {

    /* renamed from: a */
    public final int f75683a;

    /* renamed from: b */
    public final ampl f75684b;

    /* renamed from: c */
    public final ampk f75685c;

    public ampm(Context context, int i) {
        this(context, context.getApplicationInfo().uid, i);
    }

    /* renamed from: a */
    public static ampm m63135a(Context context, int i) {
        amig.m62939a();
        if (Boolean.valueOf(cfvk.f185780a.mo6606a().mo82918I()).booleanValue()) {
            if (((Boolean) amie.f74933a.mo41191a()).booleanValue()) {
                return new ampm(context, i, 5380, cfvk.m143179e(), ((Integer) amft.f74870a.mo41191a()).intValue(), cfvk.m143178d());
            }
            return new ampm(context, i, 5380, cfvk.m143179e(), ((Integer) amft.f74870a.mo41191a()).intValue(), null);
        } else if (!((Boolean) amie.f74933a.mo41191a()).booleanValue()) {
            return new ampm(context, i, 5380);
        } else {
            return new ampm(context, i, 5380, cfvk.m143178d());
        }
    }

    public ampm(Context context, int i, int i2) {
        this(context, i, i2, null);
    }

    public ampm(Context context, int i, int i2, String str) {
        this(context, i, i2, cgbe.f186279a.mo6606a().mo83461o(), (int) cgbe.f186279a.mo6606a().mo83462p(), str);
    }

    public ampm(Context context, int i, int i2, String str, int i3, String str2) {
        shl shl = new shl(context, str, i3, i, i2);
        if (str2 != null) {
            shl.f44484f = str2;
        }
        this.f75684b = new ampl(shl);
        this.f75685c = new ampk(shl);
        amig.m62939a();
        this.f75683a = Math.max(1000, Integer.valueOf((int) cfvk.f185780a.mo6606a().mo82983au()).intValue());
    }

    /* renamed from: a */
    public final btdb mo41249a(ClientContext clientContext, btcz btcz) {
        try {
            return this.f75684b.mo41248a(clientContext, btcz, (long) this.f75683a);
        } catch (chuw | gid e) {
            Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", e);
            throw e;
        }
    }

    /* renamed from: a */
    public final btdd mo41250a(ClientContext clientContext, btde btde) {
        try {
            ampl ampl = this.f75684b;
            long j = (long) this.f75683a;
            if (ampl.f75676k == null) {
                ampl.f75676k = chtv.m149566a(chtu.UNARY, "google.internal.people.v2.InternalPeopleService/GetPersonPhotoEncoded", ciie.m150370a(btde.f148384e), ciie.m150370a(btdd.f148380c));
            }
            return (btdd) ampl.f75682a.mo25553a(ampl.f75676k, clientContext, btde, j, TimeUnit.MILLISECONDS);
        } catch (chuw | gid e) {
            Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", e);
            throw e;
        }
    }

    /* renamed from: a */
    public final bteu mo41251a(ClientContext clientContext, btet btet) {
        try {
            ampl ampl = this.f75684b;
            long j = (long) this.f75683a;
            if (ampl.f75677l == null) {
                ampl.f75677l = chtv.m149566a(chtu.UNARY, "google.internal.people.v2.InternalPeopleService/UpdatePersonPhoto", ciie.m150370a(btet.f148559h), ciie.m150370a(bteu.f148568d));
            }
            return (bteu) ampl.f75682a.mo25553a(ampl.f75677l, clientContext, btet, j, TimeUnit.MILLISECONDS);
        } catch (chuw | gid e) {
            Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", e);
            throw e;
        }
    }
}

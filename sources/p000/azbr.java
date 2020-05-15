package p000;

import android.content.Context;
import android.util.Pair;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: azbr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azbr implements bdai {

    /* renamed from: a */
    private final Context f98920a;

    public azbr(Context context) {
        this.f98920a = context;
    }

    /* renamed from: a */
    private static KeyPair m85216a(byte[] bArr, byte[] bArr2) {
        try {
            KeyFactory instance = KeyFactory.getInstance("EC");
            return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(bArr)), instance.generatePrivate(new PKCS8EncodedKeySpec(bArr2)));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m85217a(Context context, azct azct) {
        if (azct != null && !azdl.m85412a(context).mo54735I()) {
            List<LocalEntityId> list = azct.f99010g;
            bcok g = bcol.m89477g();
            g.mo57068c("MS");
            HashSet hashSet = new HashSet();
            for (LocalEntityId localEntityId : list) {
                int i = localEntityId.f111075b;
                if (i == 1) {
                    hashSet.add(localEntityId.f111074a);
                } else if (i == 7) {
                    g.mo57067b(localEntityId.f111074a);
                } else if (i == 8) {
                    g.mo57065a(localEntityId.f111074a);
                }
            }
            g.mo57066a(hashSet);
            bcol a = g.mo57063a();
            bcow f = bcoz.m89553f();
            f.mo57126a(bngx.m109368a((Collection) bqce.m112560a(azct.f99005b)));
            f.f104648a = Long.valueOf(TimeUnit.MILLISECONDS.toMicros(azct.f99006c));
            f.f104649b = Long.valueOf(azct.f99012i);
            KeyPair a2 = m85216a(azct.f99008e, azct.f99007d);
            if (a2 != null) {
                f.mo57127a(a2);
            } else {
                Pair create = Pair.create(azct.f99007d, azct.f99008e);
                if (create != null) {
                    f.f104650c = new bcpp(create);
                } else {
                    throw null;
                }
            }
            bcoz a3 = f.mo57125a();
            bcoe f2 = bcoh.m89462f();
            f2.mo57055a(a);
            byte[] bArr = azct.f99004a;
            f2.mo57056a(bArr == null ? bxtx.f164797b : bxtx.m123261a(bArr));
            f2.mo57053a(bcog.VALID);
            azbj.m85193a(context).mo54570j().mo56664a(f2.mo57051a(), a3);
        }
    }

    /* renamed from: a */
    public final void mo54579a() {
        LocalEntityId localEntityId;
        if (!cfgs.m139391K()) {
            List g = azcm.m85300a(this.f98920a).mo54669g();
            int size = g.size();
            for (int i = 0; i < size; i++) {
                Context context = this.f98920a;
                m85217a(context, azcm.m85300a(context).mo54656b((byte[]) g.get(i)));
            }
            if (azdl.m85412a(this.f98920a).mo54775f()) {
                localEntityId = new LocalEntityId(azdl.m85412a(this.f98920a).mo54738a(), 1, "MS");
            } else if (azdl.m85412a(this.f98920a).mo54802x()) {
                localEntityId = azcv.f99014b;
            } else {
                return;
            }
            Context context2 = this.f98920a;
            m85217a(context2, azcv.m85357a(context2).mo54701d(localEntityId));
        }
    }
}

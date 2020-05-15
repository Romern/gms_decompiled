package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.internal.InternalCredentialWrapper;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: hsk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hsk implements hep {

    /* renamed from: a */
    protected static final Logger f20355a = ght.m13172b("SaveOperation");

    /* renamed from: h */
    public static final /* synthetic */ int f20356h = 0;

    /* renamed from: b */
    public final Context f20357b;

    /* renamed from: c */
    public final hky f20358c;

    /* renamed from: d */
    public final String f20359d;

    /* renamed from: e */
    public final Credential f20360e;

    /* renamed from: f */
    public final String f20361f;

    /* renamed from: g */
    public final hln f20362g;

    /* renamed from: i */
    private final hnc f20363i = hnc.m14626a();

    public hsk(Context context, String str, Credential credential, String str2) {
        this.f20357b = context;
        this.f20362g = hln.m14581a(context);
        this.f20358c = hms.m14612a(context);
        this.f20359d = str;
        this.f20360e = credential;
        this.f20361f = str2;
    }

    /* renamed from: a */
    public static bmxv m14815a(Credential credential) {
        return bnjd.m109599f(heb.m14256a(), new hrt(credential));
    }

    /* renamed from: a */
    public final adbj mo12290a() {
        return adbj.AUTH_API_CREDENTIALS_SAVE;
    }

    /* renamed from: a */
    public final bqgg mo12291a(hez hez) {
        if (!((Boolean) hfc.f19637b.mo58455c()).booleanValue() || cgyj.f188055a.mo6606a().mo84753a().contains("auth_api_credentials")) {
            throw adbe.m50106a(28432);
        } else if (!"https://accounts.google.com".equals(this.f20360e.f10097f) || m14815a(this.f20360e).mo66813a()) {
            bqgg a = new hou(this.f20357b).mo12291a(hez);
            return bqdx.m112674a(bqdx.m112674a(a, new hrs(this, hez), bqfb.INSTANCE), new hsb(this, hez, a), bqfb.INSTANCE);
        } else {
            throw adbe.m50106a(28441);
        }
    }

    /* renamed from: a */
    public final bqgg mo12692a(hez hez, Iterable iterable) {
        this.f20363i.mo12623a(this.f20359d, true);
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InternalCredentialWrapper internalCredentialWrapper = (InternalCredentialWrapper) it.next();
            Account account = internalCredentialWrapper.f10140b;
            bmxy.m108581a(account);
            adbj adbj = adbj.AUTH_API_CREDENTIALS_CREDENTIAL_DATA_PROVIDER_SAVE;
            bqgg a = this.f20358c.mo12598a(heb.m14255a(account), this.f20359d, internalCredentialWrapper.f10139a);
            hez.mo12448a(adbj, a);
            arrayList.add(a);
        }
        return bqga.m112785c(arrayList).mo69216a(bqel.m112709a(), bqfb.INSTANCE);
    }
}

package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.constellation.IdTokenRequest;
import com.google.android.gms.constellation.VerifyPhoneNumberRequest;
import com.google.android.gms.constellation.VerifyPhoneNumberResponse;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;

/* renamed from: sym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sym extends aaab {

    /* renamed from: a */
    public static final sek f45439a = tea.m36798a("api_verify_phone_operation");

    /* renamed from: b */
    public static final EnumMap f45440b;

    /* renamed from: c */
    public final syy f45441c;

    /* renamed from: d */
    public final int f45442d;

    /* renamed from: e */
    public final tds f45443e;

    /* renamed from: f */
    public UUID f45444f;

    /* renamed from: g */
    private final VerifyPhoneNumberRequest f45445g;

    /* renamed from: h */
    private final String f45446h;

    /* renamed from: i */
    private final Bundle f45447i;

    /* renamed from: j */
    private final Context f45448j;

    /* renamed from: k */
    private final tdl f45449k = new syl(this, new snr(new sns(10)));

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object
     arg types: [cbob, int]
     candidates:
      ClspMth{java.util.EnumMap.put(java.lang.Object, java.lang.Object):java.lang.Object}
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object */
    static {
        EnumMap enumMap = new EnumMap(cbob.class);
        f45440b = enumMap;
        enumMap.put((Enum) cbob.UNKNOWN, (Object) 0);
        f45440b.put((Enum) cbob.MO_SMS, (Object) 1);
        f45440b.put((Enum) cbob.MT_SMS, (Object) 2);
        f45440b.put((Enum) cbob.CARRIER_ID, (Object) 3);
        f45440b.put((Enum) cbob.IMSI_LOOKUP, (Object) 5);
        f45440b.put((Enum) cbob.REGISTERED_SMS, (Object) 7);
        f45440b.put((Enum) cbob.FLASH_CALL, (Object) 8);
    }

    public sym(Context context, syy syy, Bundle bundle) {
        super(MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA, "VerifyPhoneNumber");
        this.f45448j = context;
        this.f45441c = syy;
        this.f45447i = bundle;
        this.f45443e = tds.m36774a(context);
        this.f45445g = null;
        this.f45446h = null;
        this.f45442d = 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (!cdfw.f180710a.mo6606a().mo77449d()) {
            mo6503a(new Status(5005));
            return;
        }
        UUID randomUUID = UUID.randomUUID();
        this.f45444f = randomUUID;
        this.f45443e.mo26401a(randomUUID, 17);
        if (this.f45442d == 1) {
            f45439a.mo25412b("VerifyPNOperation: calling v1", new Object[0]);
            sxt.m36563a();
            sxt.m36565a(context, this.f45444f, 7, this.f45447i, this.f45449k);
            return;
        }
        f45439a.mo25412b("VerifyPNOperation: calling v2", new Object[0]);
        sxt.m36563a();
        UUID uuid = this.f45444f;
        VerifyPhoneNumberRequest verifyPhoneNumberRequest = this.f45445g;
        String str = verifyPhoneNumberRequest.f30486a;
        long j = verifyPhoneNumberRequest.f30487b;
        IdTokenRequest idTokenRequest = verifyPhoneNumberRequest.f30488c;
        String str2 = idTokenRequest.f30472a;
        String str3 = idTokenRequest.f30473b;
        String str4 = this.f45446h;
        Bundle bundle = verifyPhoneNumberRequest.f30489d;
        tdl tdl = this.f45449k;
        Intent startIntent = IntentOperation.getStartIntent(context, "com.google.android.gms.constellation.EventManager", "com.google.android.gms.constellation.eventmanager.SYNC_VERIFICATION");
        startIntent.putExtra("eventmanager.session_id", uuid.toString());
        startIntent.putExtra("eventmanager.trigger_type", 7);
        startIntent.putExtra("eventmanager.on_sync_complete_callback_key", tdl.f45700e);
        startIntent.putExtra("eventmanager.policy_id_key", str);
        startIntent.putExtra("eventmanager.max_verification_age_key", j);
        startIntent.putExtra("eventmanager.certificate_hash_key", str2);
        startIntent.putExtra("eventmanager.token_nonce_key", str3);
        startIntent.putExtra("eventmanager.calling_package_key", str4);
        startIntent.putExtra("eventmanager.extra_param", bundle);
        startIntent.putStringArrayListExtra("gaia_tokens", null);
        startIntent.putExtra("iid_token", (String) null);
        context.startService(startIntent);
    }

    public sym(Context context, syy syy, VerifyPhoneNumberRequest verifyPhoneNumberRequest, String str) {
        super(MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA, "VerifyPhoneNumber");
        this.f45448j = context;
        this.f45441c = syy;
        this.f45447i = null;
        this.f45443e = tds.m36774a(context);
        this.f45445g = verifyPhoneNumberRequest;
        this.f45446h = str;
        this.f45442d = 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        if (this.f45442d == 1) {
            this.f45441c.mo26221a(status, (List) null);
        } else {
            this.f45441c.mo26248a(status, (VerifyPhoneNumberResponse) null);
        }
    }
}

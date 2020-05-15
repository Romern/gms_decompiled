package p000;

import android.os.Bundle;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: atsy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atsy {

    /* renamed from: a */
    public static final srn f90808a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: A */
    public byte[] f90809A;

    /* renamed from: B */
    public int f90810B;

    /* renamed from: C */
    public CardInfo f90811C;

    /* renamed from: D */
    public byte[] f90812D;

    /* renamed from: E */
    public byte[] f90813E;

    /* renamed from: F */
    public byte[] f90814F;

    /* renamed from: G */
    public String f90815G;

    /* renamed from: H */
    public byte[] f90816H;

    /* renamed from: I */
    public byte[] f90817I;

    /* renamed from: J */
    public bnhe f90818J;

    /* renamed from: K */
    public boolean f90819K;

    /* renamed from: L */
    public byte[] f90820L;

    /* renamed from: M */
    public boolean f90821M;

    /* renamed from: N */
    public boolean f90822N;

    /* renamed from: O */
    public boolean f90823O;

    /* renamed from: P */
    public boolean f90824P;

    /* renamed from: Q */
    public String f90825Q;

    /* renamed from: R */
    public int f90826R;

    /* renamed from: S */
    public boolean f90827S;

    /* renamed from: T */
    public int f90828T;

    /* renamed from: U */
    public byte[] f90829U;

    /* renamed from: V */
    public byte[] f90830V;

    /* renamed from: W */
    public int f90831W;

    /* renamed from: X */
    public btnf f90832X;

    /* renamed from: Y */
    public final long f90833Y;

    /* renamed from: Z */
    public final ArrayList f90834Z;

    /* renamed from: aa */
    public bmuw f90835aa;

    /* renamed from: ab */
    public String f90836ab;

    /* renamed from: ac */
    public int f90837ac;

    /* renamed from: ad */
    public int f90838ad;

    /* renamed from: b */
    public int f90839b;

    /* renamed from: c */
    public int f90840c = Integer.MIN_VALUE;

    /* renamed from: d */
    public byte[] f90841d;

    /* renamed from: e */
    public String f90842e;

    /* renamed from: f */
    public int f90843f;

    /* renamed from: g */
    public byte[] f90844g;

    /* renamed from: h */
    public String f90845h;

    /* renamed from: i */
    public btmo f90846i;

    /* renamed from: j */
    public String f90847j;

    /* renamed from: k */
    public boolean f90848k = false;

    /* renamed from: l */
    public String f90849l;

    /* renamed from: m */
    public String f90850m;

    /* renamed from: n */
    public boolean f90851n;

    /* renamed from: o */
    public final boolean f90852o;

    /* renamed from: p */
    public String f90853p;

    /* renamed from: q */
    String f90854q;

    /* renamed from: r */
    public boolean f90855r;

    /* renamed from: s */
    public boolean f90856s;

    /* renamed from: t */
    public AccountInfo f90857t;

    /* renamed from: u */
    public String f90858u;

    /* renamed from: v */
    public byte[] f90859v;

    /* renamed from: w */
    public byte[] f90860w;

    /* renamed from: x */
    public String f90861x;

    /* renamed from: y */
    public boolean f90862y;

    /* renamed from: z */
    public boolean f90863z;

    public atsy(Bundle bundle) {
        int i = 2;
        this.f90837ac = 2;
        this.f90838ad = 1;
        this.f90819K = false;
        this.f90827S = false;
        this.f90831W = 0;
        this.f90835aa = bmuw.f130975l;
        sre.m36089i(rpr.m34216b());
        this.f90852o = false;
        if (bundle != null) {
            this.f90857t = (AccountInfo) bundle.getParcelable("state_account_info");
            this.f90842e = bundle.getString("state_cvc");
            this.f90839b = bundle.getInt("state_tokenize_flow_step");
            this.f90840c = bundle.getInt("state_launched_activity");
            this.f90843f = bundle.getInt("state_token_service_provider");
            this.f90844g = bundle.getByteArray("state_eligibility_receipt");
            this.f90845h = bundle.getString("state_terms_and_conditions_title");
            byte[] byteArray = bundle.getByteArray("state_terms_and_conditions");
            this.f90858u = bundle.getString("state_bundle_type");
            if (byteArray != null) {
                try {
                    this.f90846i = (btmo) bxvk.m124016a(btmo.f149520c, byteArray, bxus.m123744c());
                } catch (bxwf e) {
                }
            }
            this.f90847j = bundle.getString("state_terms_and_conditions_url");
            this.f90849l = bundle.getString("state_session_id");
            this.f90855r = bundle.getBoolean("state_warm_welcome_required", false);
            this.f90856s = bundle.getBoolean("state_keyguard_setup_required", false);
            this.f90811C = (CardInfo) bundle.getParcelable("state_card_info");
            this.f90813E = bundle.getByteArray("state_orchestration_add_token");
            this.f90814F = bundle.getByteArray("state_orchestration_verify_token");
            this.f90850m = bundle.getString("state_cardholder_name");
            this.f90851n = bundle.getBoolean("state_had_attestation_error", false);
            this.f90853p = bundle.getString("nodeId");
            this.f90841d = bundle.getByteArray("state_card_id");
            this.f90859v = bundle.getByteArray("push_tokenize_request");
            this.f90860w = bundle.getByteArray("push_tokenize_session_request");
            int b = btna.m116943b(bundle.getInt("state_client_type"));
            this.f90837ac = b != 0 ? b : i;
            this.f90817I = bundle.getByteArray("state_activation_receipt");
            this.f90816H = bundle.getByteArray("state_orchestration_callback_data");
            this.f90815G = bundle.getString("state_instrument_id");
            this.f90861x = bundle.getString("state_calling_package");
            this.f90812D = bundle.getByteArray("state_untokenized_card");
            this.f90809A = bundle.getByteArray("state_client_token");
            this.f90810B = bundle.getInt("state_phone_wear_proxy_version");
            this.f90862y = bundle.getBoolean("state_is_account_tokenization", false);
            this.f90863z = bundle.getBoolean("state_is_about_to_show_mfi_sign_in", false);
            this.f90829U = bundle.getByteArray("state_opaque_card_data");
            this.f90830V = bundle.getByteArray("state_push_tokenize_params");
            this.f90819K = bundle.getBoolean("state_should_compress_wear_rpcs");
            this.f90821M = bundle.getBoolean("state_skip_card_chooser", false);
            this.f90828T = bundle.getInt("state_saved_to_platform", 0);
            this.f90831W = bundle.getInt("state_tokenization_status", 0);
            Serializable serializable = bundle.getSerializable("state_untokenized_edit_tokens");
            if (serializable != null) {
                this.f90818J = bnhe.m109413a((Map) serializable);
            }
            this.f90820L = bundle.getByteArray("state_warm_welcome_info");
            this.f90826R = bundle.getInt("state_felica_current_default");
            byte[] byteArray2 = bundle.getByteArray("state_api_error");
            if (byteArray2 != null) {
                try {
                    this.f90832X = (btnf) bxvk.m124016a(btnf.f149600f, byteArray2, bxus.m123744c());
                } catch (bxwf e2) {
                    bnsl bnsl = (bnsl) f90808a.mo68388c();
                    bnsl.mo68437a(e2);
                    bnsl.mo68432a("atsy", "<init>", 308, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Error cannot be unserialized");
                }
            }
            this.f90833Y = bundle.getLong("state_step_started_time_ms");
            this.f90834Z = bundle.getParcelableArrayList("state_tokenization_step_summaries");
            byte[] byteArray3 = bundle.getByteArray("token_provisioning_data");
            if (byteArray3 != null) {
                try {
                    this.f90835aa = (bmuw) bxvk.m124016a(bmuw.f130975l, byteArray3, bxus.m123744c());
                } catch (bxwf e3) {
                }
            }
            this.f90822N = bundle.getBoolean("state_monet_onboarding");
            this.f90823O = bundle.getBoolean("state_use_deferred_yp");
            this.f90836ab = bundle.getString("state_server_provisioning_session_id");
            this.f90824P = bundle.getBoolean("state_use_suw_ui");
            return;
        }
        this.f90849l = atxw.m76526a();
        this.f90839b = 4;
        this.f90833Y = System.currentTimeMillis();
        this.f90834Z = new ArrayList();
    }

    /* renamed from: a */
    public final atue mo50162a(TokenizePanChimeraActivity tokenizePanChimeraActivity) {
        int i = this.f90839b;
        switch (i) {
            case 0:
                return new atub(tokenizePanChimeraActivity);
            case 1:
            case 12:
            case 19:
            case 21:
            case 22:
            case 24:
            default:
                StringBuilder sb = new StringBuilder(39);
                sb.append("Could not get current step: ");
                sb.append(i);
                throw new RuntimeException(sb.toString());
            case 2:
                return new atty(tokenizePanChimeraActivity);
            case 3:
                return new attx(tokenizePanChimeraActivity);
            case 4:
                return new attg(tokenizePanChimeraActivity);
            case 5:
                return new attw(tokenizePanChimeraActivity);
            case 6:
                return new attq(tokenizePanChimeraActivity);
            case 7:
                return new atsz(tokenizePanChimeraActivity);
            case 8:
                return new atuk(tokenizePanChimeraActivity);
            case 9:
                return new atuj(tokenizePanChimeraActivity);
            case 10:
                return new atte(tokenizePanChimeraActivity);
            case 11:
                return new atuc(tokenizePanChimeraActivity);
            case 13:
                return new atui(tokenizePanChimeraActivity);
            case 14:
                return new atta(tokenizePanChimeraActivity);
            case 15:
                return new attn(tokenizePanChimeraActivity);
            case 16:
                return new atum(tokenizePanChimeraActivity);
            case 17:
                return new attd(tokenizePanChimeraActivity);
            case 18:
                return new atul(tokenizePanChimeraActivity);
            case 20:
                return new attp(tokenizePanChimeraActivity);
            case 23:
                return new attm(tokenizePanChimeraActivity);
            case 25:
                return new attj(tokenizePanChimeraActivity);
            case 26:
                return new attr(tokenizePanChimeraActivity);
            case 27:
                return new atts(tokenizePanChimeraActivity);
            case 28:
                return new atuh(tokenizePanChimeraActivity);
            case 29:
                return new attf(tokenizePanChimeraActivity);
            case 30:
                return new attb(tokenizePanChimeraActivity);
            case 31:
                return new atud(tokenizePanChimeraActivity);
            case 32:
                return new attl(tokenizePanChimeraActivity);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo50163a() {
        return this.f90837ac == 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo50164b() {
        return this.f90859v != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo50165c() {
        return this.f90860w != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo50166d() {
        return this.f90836ab != null || mo50167e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo50167e() {
        return !this.f90835aa.f130977a.isEmpty();
    }
}

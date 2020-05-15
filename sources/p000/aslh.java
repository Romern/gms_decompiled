package p000;

import android.content.Intent;
import android.view.View;

/* renamed from: aslh */
final /* synthetic */ class aslh implements View.OnClickListener {

    /* renamed from: a */
    private final asli f89161a;

    /* renamed from: b */
    private final aslz f89162b;

    public aslh(asli asli, aslz aslz) {
        this.f89161a = asli;
        this.f89162b = aslz;
    }

    public void onClick(View view) {
        asli asli = this.f89161a;
        aslz aslz = this.f89162b;
        asku asku = asli.f89165e;
        asly asly = aslz.f89210a;
        asku.f89135d.f89176g.add(asly);
        int ordinal = asly.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                atya atya = asku.f89132a;
                if (atya != null) {
                    atya.mo50313b();
                    return;
                }
                return;
            } else if (ordinal != 2) {
                if (ordinal == 3) {
                    Intent intent = new Intent("com.google.android.gms.tapandpay.ACTION_ENABLE_SECURE_KEYGUARD");
                    intent.setClassName("com.google.android.gms", "com.google.android.gms.tapandpay.ui.EnableSecureKeyguardActivity");
                    asku.f89133b.startActivity(intent);
                    return;
                } else if (ordinal == 4) {
                    Intent intent2 = new Intent("com.google.android.gms.tapandpay.ACTION_TOKENIZE_PAN");
                    intent2.setClassName("com.google.android.gms", "com.google.android.gms.tapandpay.tokenization.TokenizePanActivity");
                    intent2.putExtra("extra_calling_package", "com.google.android.gms.ui");
                    intent2.putExtra("extra_account_info", asku.f89134c);
                    asku.f89133b.startActivity(intent2);
                    return;
                } else if (ordinal != 5) {
                    return;
                }
            } else if (asku.f89132a != null) {
                asku.f89133b.startActivity(atyb.f91104a);
                return;
            } else {
                return;
            }
        }
        String valueOf = String.valueOf(asly);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("unexpected action for type: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }
}

package p000;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;

/* renamed from: aszc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aszc extends atex {

    /* renamed from: b */
    protected CardInfo f89909b;

    /* renamed from: c */
    protected AccountInfo f89910c;

    /* renamed from: d */
    protected String f89911d;

    /* renamed from: e */
    protected rjx f89912e;

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract String mo49706e();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract int mo49707g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract int mo49708h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo49709i();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo49710j();

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setFinishOnTouchOutside(false);
        setContentView((int) C0126R.C0128layout.tp_dialog_layout);
        CardInfo cardInfo = (CardInfo) getIntent().getParcelableExtra("extra_card_info");
        sdo.m34959a(cardInfo);
        this.f89909b = cardInfo;
        AccountInfo accountInfo = (AccountInfo) getIntent().getParcelableExtra("extra_account_info");
        sdo.m34959a(accountInfo);
        this.f89910c = accountInfo;
        String stringExtra = getIntent().getStringExtra("extra_calling_package");
        sdo.m34959a((Object) stringExtra);
        this.f89911d = stringExtra;
        ((TextView) findViewById(C0126R.C0129id.tp_request_prompt_text)).setText(mo49706e());
        Button button = (Button) findViewById(C0126R.C0129id.tp_button_negative);
        Button button2 = (Button) findViewById(C0126R.C0129id.tp_button_positive);
        button.setText(mo49707g());
        button.setOnClickListener(new asza(this, button, button2));
        button2.setText(mo49708h());
        button2.setOnClickListener(new aszb(this, button, button2));
        if (this.f89912e == null) {
            this.f89912e = rjx.m33697b((Activity) this);
        }
    }
}

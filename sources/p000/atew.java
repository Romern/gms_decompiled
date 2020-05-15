package p000;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.chimera.ActivityBase;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;

/* renamed from: atew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atew implements LayoutInflater.Factory2 {

    /* renamed from: a */
    public AccountInfo f90210a;

    /* renamed from: b */
    private final Context f90211b;

    /* renamed from: c */
    private final LayoutInflater f90212c;

    public atew(Context context, LayoutInflater layoutInflater) {
        this.f90211b = context;
        this.f90212c = layoutInflater;
    }

    /* renamed from: a */
    public final LayoutInflater mo49912a() {
        atev atev = new atev(this, this.f90212c);
        atev.setFactory2(this);
        return atev;
    }

    /* renamed from: b */
    public final void mo49914b() {
        Intent intent = ((ActivityBase) this.f90211b).getIntent();
        if (intent != null) {
            AccountInfo accountInfo = (AccountInfo) intent.getParcelableExtra("extra_account_info");
            if (accountInfo == null) {
                accountInfo = (AccountInfo) intent.getParcelableExtra("accountInfo");
            }
            if (accountInfo != null) {
                this.f90210a = accountInfo;
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        char c;
        switch (str.hashCode()) {
            case -1279223019:
                if (str.equals("com.google.android.material.button.MaterialButton")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -443652810:
                if (str.equals("RelativeLayout")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1127291599:
                if (str.equals("LinearLayout")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return new auaz(context, attributeSet);
            case 2:
                return new aubc(context, attributeSet);
            case 3:
                return new auax(context, attributeSet);
            case 4:
                return new auaw(context, attributeSet);
            case 5:
                return new auba(context, attributeSet);
            case 6:
                return new aubb(context, attributeSet);
            case 7:
                return new auay(context, attributeSet);
            default:
                return null;
        }
    }

    /* renamed from: a */
    public final void mo49913a(Intent intent) {
        String str;
        if (intent.getPackage() != null) {
            str = intent.getPackage();
        } else {
            str = intent.getComponent() != null ? intent.getComponent().getPackageName() : "";
        }
        if (str.equals(this.f90211b.getPackageName())) {
            intent.setExtrasClassLoader(this.f90211b.getClassLoader());
            if (this.f90210a != null && !intent.hasExtra("extra_account_info")) {
                intent.putExtra("extra_account_info", this.f90210a);
            }
        }
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}

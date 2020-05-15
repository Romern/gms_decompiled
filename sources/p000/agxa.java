package p000;

import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* renamed from: agxa */
public final /* synthetic */ class agxa implements View.OnClickListener {

    /* renamed from: a */
    private final agxe f66760a;

    /* renamed from: b */
    private final bszg f66761b;

    public agxa(agxe agxe, bszg bszg) {
        this.f66760a = agxe;
        this.f66761b = bszg;
    }

    public void onClick(View view) {
        Intent intent;
        agxe agxe = this.f66760a;
        bszg bszg = this.f66761b;
        agrl a = agrl.m54942a();
        int b = btbi.m116395b(bszg.f147821f);
        if (b == 0) {
            b = 1;
        }
        int a2 = btbi.m116394a(b);
        String str = bszg.f147818c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(a2);
        sb.append(":");
        sb.append(str);
        a.mo35987a(35, sb.toString(), (String) null, bygd.SUPPORT_METHOD_LAUNCHED, System.currentTimeMillis(), agvh.m55172b());
        int b2 = btbi.m116395b(bszg.f147821f);
        if (b2 == 0) {
            b2 = 1;
        }
        int i = b2 - 2;
        if (i == 1) {
            intent = new Intent("android.intent.action.DIAL");
            String valueOf = String.valueOf(bszg.f147818c);
            intent.setData(Uri.parse(valueOf.length() == 0 ? new String("tel:") : "tel:".concat(valueOf)));
        } else if (i == 2) {
            intent = new Intent("android.intent.action.SENDTO");
            intent.setType("*/*");
            String valueOf2 = String.valueOf(bszg.f147818c);
            intent.setData(Uri.parse(valueOf2.length() == 0 ? new String("mailto:") : "mailto:".concat(valueOf2)));
            if (!bszg.f147819d.isEmpty()) {
                intent.putExtra("android.intent.extra.SUBJECT", bszg.f147819d);
            }
            if (!bszg.f147820e.isEmpty()) {
                intent.putExtra("android.intent.extra.TEXT", bszg.f147820e);
            }
        } else if (i == 3) {
            intent = new Intent("android.intent.action.VIEW", Uri.parse(bszg.f147818c));
        } else if (i == 4) {
            intent = new Intent();
            intent.setAction("android.intent.action.SENDTO");
            String valueOf3 = String.valueOf(bszg.f147818c);
            intent.setData(Uri.parse(valueOf3.length() == 0 ? new String("smsto:") : "smsto:".concat(valueOf3)));
            if (!bszg.f147820e.isEmpty()) {
                intent.putExtra("sms_body", bszg.f147820e);
            }
        } else {
            return;
        }
        if (intent.resolveActivity(agxe.f66771v.getPackageManager()) != null) {
            agxe.f66771v.startActivity(intent);
            return;
        }
        AlertDialog create = new AlertDialog.Builder(agxe.f66771v).setTitle(bszg.f147816a).setMessage(agxe.f66771v.getString(C0126R.string.launch_support_method_error_message)).setPositiveButton(agxe.f66771v.getString(C0126R.string.dialog_got_it), agxb.f66762a).create();
        if (cfnm.m140639j()) {
            create.setOnShowListener(new agxc(agxe, create));
            create.show();
        } else {
            create.setOnShowListener(new agxd(agxe, create));
            create.show();
        }
        create.show();
    }
}

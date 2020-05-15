package p000;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: fph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fph implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ fpk f17078a;

    public fph(fpk fpk) {
        this.f17078a = fpk;
    }

    public void onClick(View view) {
        try {
            fpk fpk = this.f17078a;
            SimpleDateFormat simpleDateFormat = fpk.f17083a;
            String valueOf = String.valueOf(fpk.f17087e.getText());
            String valueOf2 = String.valueOf(this.f17078a.f17089g.getText());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
            sb.append(valueOf);
            sb.append(" ");
            sb.append(valueOf2);
            Date parse = simpleDateFormat.parse(sb.toString());
            fpk fpk2 = this.f17078a;
            SimpleDateFormat simpleDateFormat2 = fpk2.f17083a;
            String valueOf3 = String.valueOf(fpk2.f17088f.getText());
            String valueOf4 = String.valueOf(this.f17078a.f17090h.getText());
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 1 + String.valueOf(valueOf4).length());
            sb2.append(valueOf3);
            sb2.append(" ");
            sb2.append(valueOf4);
            if (!this.f17078a.mo11104a(parse, simpleDateFormat2.parse(sb2.toString()))) {
                this.f17078a.mo11106c();
                File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "WirelessRadioActivitySummary.txt");
                fpk fpk3 = this.f17078a;
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                intent.setType("text/plain");
                fpk3.startActivity(intent);
            }
        } catch (ParseException e) {
            Log.e("ShareRadioActivity", "Failed to parse text when creating start or end date", e);
        }
    }
}

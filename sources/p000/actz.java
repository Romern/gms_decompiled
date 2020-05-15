package p000;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import java.net.URISyntaxException;

/* renamed from: actz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class actz implements View.OnClickListener {

    /* renamed from: a */
    public String f60784a = "";

    /* renamed from: b */
    private final Context f60785b;

    public actz(Context context) {
        this.f60785b = context;
    }

    public void onClick(View view) {
        Intent intent;
        TextView textView = (TextView) view;
        String charSequence = textView.getText().toString();
        try {
            intent = Intent.parseUri(charSequence, 3);
        } catch (URISyntaxException e) {
            intent = new Intent("android.intent.action.VIEW", Uri.parse(charSequence));
        }
        intent.setFlags(268435456);
        if (this.f60784a.isEmpty()) {
            absg.m48205e("No package name set in intent for deep-linked indexable url.");
        } else if (!this.f60784a.equals("com.google.android.gms")) {
            intent.setPackage(this.f60784a);
        }
        try {
            this.f60785b.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            String str = this.f60784a;
            String valueOf = String.valueOf(textView.getText());
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(valueOf).length());
            sb.append(str);
            sb.append(" Cannot resolve URL. ");
            sb.append(valueOf);
            absg.m48205e(sb.toString());
            Toast.makeText(this.f60785b, String.valueOf(this.f60784a).concat(" Cannot resolve URL."), 1).show();
        }
    }
}

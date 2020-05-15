package p000;

import android.content.Context;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.List;

/* renamed from: abcs */
public final /* synthetic */ class abcs implements Runnable {

    /* renamed from: a */
    private final Context f57046a;

    /* renamed from: b */
    private final GoogleHelp f57047b;

    /* renamed from: c */
    private final bqgj f57048c;

    /* renamed from: d */
    private final List f57049d;

    public abcs(Context context, GoogleHelp googleHelp, bqgj bqgj, List list) {
        this.f57046a = context;
        this.f57047b = googleHelp;
        this.f57048c = bqgj;
        this.f57049d = list;
    }

    public final void run() {
        Context context = this.f57046a;
        GoogleHelp googleHelp = this.f57047b;
        abda.m47534a(context.getApplicationContext(), HelpConfig.m66350a(googleHelp, context), null, this.f57048c, this.f57049d);
    }
}

package p000;

import android.content.Context;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Pattern;

/* renamed from: bdtt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdtt {

    /* renamed from: a */
    public final bduf f106427a;

    public bdtt() {
        bduf bduf = new bduf();
        bduf.f106462e = bdue.f106457a;
        this.f106427a = bduf;
        bduf.f106460c = new aytg();
    }

    /* renamed from: a */
    public final bdtr mo58363a() {
        this.f106427a.f106463f = new bdts();
        bduf bduf = this.f106427a;
        Context context = bduf.f106458a;
        if (context != null) {
            bduf.f106461d = new bdrl(context);
            bduf bduf2 = this.f106427a;
            String str = bduf2.f106458a == null ? " context" : "";
            if (bduf2.f106459b == null) {
                str = str.concat(" instanceId");
            }
            if (bduf2.f106460c == null) {
                str = String.valueOf(str).concat(" clock");
            }
            if (bduf2.f106461d == null) {
                str = String.valueOf(str).concat(" loggerFactory");
            }
            if (bduf2.f106462e == null) {
                str = String.valueOf(str).concat(" facsClientFactory");
            }
            if (bduf2.f106463f == null) {
                str = String.valueOf(str).concat(" flags");
            }
            if (str.isEmpty()) {
                return new bduh(new bdtv(bduf2.f106458a, bduf2.f106459b, bduf2.f106460c, bduf2.f106461d, bduf2.f106462e, bduf2.f106463f));
            }
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
        }
        throw new IllegalStateException("Property \"context\" has not been set");
    }

    @Deprecated
    /* renamed from: a */
    public final void mo58365a(String str) {
        this.f106427a.f106459b = str;
    }

    /* renamed from: b */
    public final void mo58366b(String str) {
        bmxy.m108596a(Pattern.matches("[a-z]+", str), "Module must be non-empty and [a-z]: %s", str);
        bmxy.m108596a(!Collections.unmodifiableSet(new HashSet(Arrays.asList("default", "unused", "special", "reserved", "shared", "virtual", "managed"))).contains(str), "Module name is reserved and cannot be used: %s", str);
        this.f106427a.f106459b = str;
    }

    /* renamed from: a */
    public final void mo58364a(Context context) {
        bduf bduf = this.f106427a;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            bduf.f106458a = applicationContext;
            return;
        }
        throw new NullPointerException("Null context");
    }
}

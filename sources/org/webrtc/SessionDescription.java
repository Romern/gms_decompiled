package org.webrtc;

import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SessionDescription {

    /* renamed from: a */
    public final Type f192048a;

    /* renamed from: b */
    public final String f192049b;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum Type {
        OFFER,
        PRANSWER,
        ANSWER
    }

    public SessionDescription(Type type, String str) {
        this.f192048a = type;
        this.f192049b = str;
    }

    /* access modifiers changed from: package-private */
    public String getDescription() {
        return this.f192049b;
    }

    /* access modifiers changed from: package-private */
    public String getTypeInCanonicalForm() {
        return this.f192048a.name().toLowerCase(Locale.US);
    }
}

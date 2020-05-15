package p000;

import android.content.Intent;
import com.google.android.gms.userlocation.SemanticLocation;

/* renamed from: avwf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avwf {

    /* renamed from: a */
    public final SemanticLocation f94014a;

    /* renamed from: b */
    private final SemanticLocation f94015b;

    public avwf(SemanticLocation semanticLocation, SemanticLocation semanticLocation2) {
        this.f94015b = semanticLocation;
        this.f94014a = semanticLocation2;
    }

    /* renamed from: a */
    public static avwf m79457a(SemanticLocation semanticLocation, SemanticLocation semanticLocation2) {
        if (semanticLocation2 != null) {
            return new avwf(semanticLocation, semanticLocation2);
        }
        return null;
    }

    /* renamed from: a */
    public final Intent mo51666a() {
        Intent intent = new Intent();
        SemanticLocation semanticLocation = this.f94015b;
        if (semanticLocation != null) {
            sef.m35071a(semanticLocation, intent, "com.google.android.userlocation.extra.previous_location");
        }
        sef.m35071a(this.f94014a, intent, "com.google.android.userlocation.extra.current_location");
        return intent;
    }
}

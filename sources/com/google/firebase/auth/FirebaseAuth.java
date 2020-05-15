package com.google.firebase.auth;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class FirebaseAuth implements brrz {
    public static FirebaseAuth getInstance() {
        synchronized (brhf.f142851a) {
            if (((brhf) brhf.f142852b.get("[DEFAULT]")) == null) {
                String a = ssy.m36271a();
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 116);
                sb.append("Default FirebaseApp is not initialized in this process ");
                sb.append(a);
                sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(sb.toString());
            }
        }
        throw null;
    }

    public static FirebaseAuth getInstance(brhf brhf) {
        throw null;
    }
}

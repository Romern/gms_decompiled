package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleDowngradeHandler;
import java.lang.reflect.InvocationTargetException;

/* renamed from: djl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class djl {
    /* renamed from: a */
    public static int m8653a(djz djz, String str) {
        dka a = djz.mo9172a(str);
        if (a != null) {
            return a.mo9186e();
        }
        return 0;
    }

    /* renamed from: a */
    public static void m8654a(Context context, djz djz, dka dka, String str, int i, int i2) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() == 0) {
            new String("Calling downgrade handler: ");
        } else {
            "Calling downgrade handler: ".concat(valueOf);
        }
        try {
            Context a = djp.m8662a().mo9140a(context, djz, dka, dfq.m8314a());
            try {
                try {
                    ((ModuleDowngradeHandler) a.getClassLoader().loadClass(str).asSubclass(ModuleDowngradeHandler.class).getConstructor(new Class[0]).newInstance(new Object[0])).prepareForDowngrade(a, i, i2);
                } catch (Exception e) {
                    String valueOf2 = String.valueOf(dka.mo9184b());
                    Log.e("DowngradeHelper", valueOf2.length() == 0 ? new String("Failed to execute downgrade handler for ") : "Failed to execute downgrade handler for ".concat(valueOf2), e);
                }
            } catch (InvalidConfigException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
                String valueOf3 = String.valueOf(str);
                Log.e("DowngradeHelper", valueOf3.length() == 0 ? new String("Failed to create downgrade handler instance for ") : "Failed to create downgrade handler instance for ".concat(valueOf3), e2);
            }
        } catch (InvalidConfigException | djq e3) {
            String valueOf4 = String.valueOf(dka.mo9184b());
            Log.e("DowngradeHelper", valueOf4.length() == 0 ? new String("Failed to load downgrade handler for ") : "Failed to load downgrade handler for ".concat(valueOf4), e3);
        }
    }
}

package p000;

import android.os.Build;
import android.os.StrictMode;
import android.os.strictmode.CredentialProtectedWhileLockedViolation;
import android.os.strictmode.CustomViolation;
import android.os.strictmode.DiskReadViolation;
import android.os.strictmode.DiskWriteViolation;
import android.os.strictmode.ImplicitDirectBootViolation;
import android.os.strictmode.InstanceCountViolation;
import android.os.strictmode.LeakedClosableViolation;
import android.os.strictmode.NetworkViolation;
import android.os.strictmode.ResourceMismatchViolation;
import android.os.strictmode.UnbufferedIoViolation;
import android.os.strictmode.UntaggedSocketViolation;
import android.os.strictmode.Violation;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Arrays;
import java.util.List;

/* renamed from: beph */
public final /* synthetic */ class beph implements StrictMode.OnThreadViolationListener {

    /* renamed from: a */
    private final bepi f111980a;

    public beph(bepi bepi) {
        this.f111980a = bepi;
    }

    public final void onThreadViolation(Violation violation) {
        int i;
        bepi bepi = this.f111980a;
        bepj bepj = new bepj();
        List asList = Arrays.asList(violation.getStackTrace());
        if (asList != null) {
            bepj.f111985b = asList;
            if (violation instanceof DiskReadViolation) {
                i = 2;
            } else if (violation instanceof DiskWriteViolation) {
                i = 1;
            } else if (violation instanceof NetworkViolation) {
                i = 4;
            } else if (violation instanceof CustomViolation) {
                i = 8;
            } else if (violation instanceof ResourceMismatchViolation) {
                i = 16;
            } else if (violation instanceof UnbufferedIoViolation) {
                i = 32;
            } else if (violation instanceof InstanceCountViolation) {
                i = 512;
            } else if (violation instanceof LeakedClosableViolation) {
                i = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            } else if (!(violation instanceof UntaggedSocketViolation)) {
                int i2 = Build.VERSION.SDK_INT;
                i = !(violation instanceof CredentialProtectedWhileLockedViolation) ? violation instanceof ImplicitDirectBootViolation ? 4096 : 0 : 2048;
            } else {
                i = Integer.MIN_VALUE;
            }
            bepj.f111984a = Integer.valueOf(i);
            String str = bepj.f111984a == null ? " violationType" : "";
            if (bepj.f111985b == null) {
                str = str.concat(" stackTrace");
            }
            if (!str.isEmpty()) {
                String valueOf = String.valueOf(str);
                throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
            }
            beoz beoz = new beoz(bepj.f111984a.intValue(), bepj.f111985b);
            bnre i3 = bepi.f111982b.listIterator();
            while (i3.hasNext()) {
                Integer num = (Integer) ((bmxj) i3.next()).apply(beoz);
                if (num != null && ((num.intValue() ^ -1) & beoz.f111968a) == 0) {
                    return;
                }
            }
            bnre i4 = bepi.f111983c.listIterator();
            while (i4.hasNext()) {
                ((bepa) i4.next()).mo60888a();
            }
            return;
        }
        throw new NullPointerException("Null stackTrace");
    }
}

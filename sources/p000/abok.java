package p000;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;

/* renamed from: abok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abok extends PhoneStateListener {

    /* renamed from: a */
    final /* synthetic */ abol f57791a;

    public abok(abol abol) {
        this.f57791a = abol;
    }

    public final void onCallStateChanged(int i, String str) {
        synchronized (this.f57791a.f57799h) {
            new Object[1][0] = Integer.valueOf(i);
            int i2 = eoa.f15378a;
            this.f57791a.f57793b = i;
        }
    }

    public final void onDataActivity(int i) {
        synchronized (this.f57791a.f57799h) {
            new Object[1][0] = Integer.valueOf(i);
            int i2 = eoa.f15378a;
            this.f57791a.f57794c = i;
        }
    }

    public final void onDataConnectionStateChanged(int i, int i2) {
        synchronized (this.f57791a.f57799h) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            int i3 = eoa.f15378a;
            abol abol = this.f57791a;
            abol.f57795d = i;
            abol.f57796e = i2;
        }
    }

    public final void onServiceStateChanged(ServiceState serviceState) {
        if (serviceState != null) {
            abol abol = this.f57791a;
            boss a = aboi.m47995a(serviceState);
            synchronized (abol.f57799h) {
                abol.f57792a = a;
            }
        }
    }
}

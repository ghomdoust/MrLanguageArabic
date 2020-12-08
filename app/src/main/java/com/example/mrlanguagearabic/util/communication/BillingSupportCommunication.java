package com.example.mrlanguagearabic.util.communication;


import com.example.mrlanguagearabic.util.IabResult;

public interface BillingSupportCommunication {
    void onBillingSupportResult(int response);
    void remoteExceptionHappened(IabResult result);
}
